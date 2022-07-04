import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Inicio extends JFrame{
    private static final DatosPrecargados precargados = new DatosPrecargados();
   
    public Inicio(int largo, int ancho) {
        setTitle("La Tropicalita");
        setSize(largo, ancho);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void iniciarComponentes(Object[][] productos) {
        JPanel panel = new JPanel();
        JLabel bienvenida = new JLabel("Bienvenido a La Tropicalita, ¿Qué Desea Realizar?");
        JTextArea area = new JTextArea(1, 10);
        JButton b1 = new JButton("Comprar");// Comprar
        JButton b2 = new JButton("Abastecer");// abastecer
        JButton b3 = new JButton("Ticket");// ticket

        panel.setLayout(new FlowLayout());

        this.getContentPane().add(panel);
        // Mensaje de Bienvenida
        panel.add(bienvenida);

        // Inicialización de los parámetros básicos de la lista de productos
        String[] columnas = { "Nombre", "Precio", "Existencia", "VTI" };

        // Creación y Asignación de la lista
        DefaultTableModel modelo = new DefaultTableModel(productos, columnas);
        JTable tabla = new JTable(modelo);//
        JScrollPane scroll = new JScrollPane(tabla);
        panel.add(scroll, BorderLayout.CENTER);

        // BOTONES
        area.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.BLACK));
        b1.setMargin(new Insets(3, 5, 3, 5));
        b2.setMargin(new Insets(3, 5, 3, 5));
        b3.setMargin(new Insets(3, 5, 3, 5));
        area.setSize(500, 500);
        // Añadir Botones
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        // Oyentes de los botones
        b1.addActionListener(new Oyente1());
        b2.addActionListener(new Oyente2());
        b3.addActionListener(new Oyente3());
    }

    class Oyente1 implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            Inicio comprar = new Inicio(500, 500); // Ventana de Comprar
            comprar.iniciarComponentesComprar(precargados.datosPrecargados());
            comprar.setVisible(true);
        }
    }

    class Oyente2 implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            Inicio abastecer = new Inicio(500, 500); // Ventana de Abastecer
            abastecer.iniciarComponentesAbastecer(precargados.datosPrecargados()); // Iniciar componentes de abastecer
            abastecer.setVisible(true);
        }
    }

    class Oyente3 implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            Inicio ticket = new Inicio(500, 500); // Ventana de Ticket
            ticket.setVisible(true);
        }
    }

    public void iniciarComponentesAbastecer(Object[][] productos) {
        JPanel panelAbas = new JPanel();
        JButton btnGuardar = new JButton("Agregar");
        JTextField txtPrecio = new JTextField("", 10);
        JTextField txtCantidad = new JTextField("", 5);
        JLabel jLabelPrecio = new JLabel("Precio");
        JLabel jLabelCantidad = new JLabel("Cantidad");
        Choice selector = new Choice();

        for (int i = 0; i < 100; i++) {
            selector.addItem((String) productos[i][0]);
        }
        panelAbas.setLayout(new FlowLayout());
        this.getContentPane().add(panelAbas);

        panelAbas.add(selector);
        panelAbas.add(jLabelPrecio);
        panelAbas.add(txtPrecio);
        panelAbas.add(jLabelCantidad);
        panelAbas.add(txtCantidad);
        panelAbas.add(btnGuardar);

        btnGuardar.addActionListener(new GuardarAbas());
    }

    class GuardarAbas implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        }
    }

    public  void iniciarComponentesComprar(Object[][] productos) {
        JPanel panelCompra = new JPanel();
        JButton btnGuardarCompra = new JButton("Guardar Datos");
        JComboBox<String> selectorCompra = new JComboBox<>();
        for (int i = 0; i < 100; i++) {
            selectorCompra.addItem((String)productos[i][0]);
        }
        
        btnGuardarCompra.setBounds(200, 0, 60, 40);
        selectorCompra.addActionListener(selectorCompra);

        panelCompra.setLayout(new FlowLayout());
        this.getContentPane().add(panelCompra);
        panelCompra.add(btnGuardarCompra);
        panelCompra.add(selectorCompra);
        btnGuardarCompra.addActionListener(new GuardarCompras());
    }
    class GuardarCompras implements ActionListener{
        public void actionPerformed(ActionEvent evento){
          JOptionPane.showMessageDialog(null, "Datos Guardados");
        }
      }
}