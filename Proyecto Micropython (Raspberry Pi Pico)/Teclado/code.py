import time
import digitalio
import board
import usb_hid

from adafruit_hid.keyboard import Keyboard
from adafruit_hid.keyboard_layout_us import KeyboardLayoutUS
from adafruit_hid.keycode import Keycode
#Copie el link de la página que desea configurar para su botón
pagina1 = "www.wikipedia.com"
pagina2 = "www.google.com"
pagina3 = "www.facebook.com"
pagina4 = "www.raspberrypi.org"
pagina5 = "www.circuitpython.org"

#Definición del comando previo para iniciar el navegador
comando_cmd = "cmd &c start chrome "

#Act/desc el micrófono zoom
micro_pin = board.GP0
#Act/desc la camara zoom
camara_pin = board.GP1
#Compartir/quitar Pantalla zoom
pantalla_pin = board.GP2
#Ini/fin grabación zoom
record_pin = board.GP3
#Chat zoom
chat_pin = board.GP4
#Fin de la reunion zoom
fin_pin = board.GP5
#abrir word desde ejecutar
word_pin = board.GP6
#Configuración CMD para abrir Paint
paint_pin = board.GP14
#Cambio de modo zoom/meet
outlook_pin = board.GP15
#Página Web 1
web1_pin = board.GP22
#Página Web 2
web2_pin = board.GP21
#Página web 3
web3_pin = board.GP20
#Página web 4
web4_pin = board.GP19
#Página web 5
web5_pin = board.GP18

#Declaración de funciones del teclado
keyboard = Keyboard(usb_hid.devices)
keyboard_layout = KeyboardLayoutUS(keyboard)

#Configuración de puerto y resistencia Pull Down
micro = digitalio.DigitalInOut(micro_pin)
micro.switch_to_input(digitalio.Pull.DOWN)

camara = digitalio.DigitalInOut(camara_pin)
camara.switch_to_input(digitalio.Pull.DOWN)

pantalla = digitalio.DigitalInOut(pantalla_pin)
pantalla.switch_to_input(digitalio.Pull.DOWN)

record = digitalio.DigitalInOut(record_pin)
record.switch_to_input(digitalio.Pull.DOWN)

chat = digitalio.DigitalInOut(chat_pin)
chat.switch_to_input(digitalio.Pull.DOWN)

fin = digitalio.DigitalInOut(fin_pin)
fin.switch_to_input(digitalio.Pull.DOWN)

word = digitalio.DigitalInOut(word_pin)
word.switch_to_input(digitalio.Pull.DOWN)

paint = digitalio.DigitalInOut(paint_pin)
paint.switch_to_input(digitalio.Pull.DOWN)

outlook = digitalio.DigitalInOut(outlook_pin)
outlook.switch_to_input(digitalio.Pull.DOWN)

web1 = digitalio.DigitalInOut(web1_pin)
web1.switch_to_input(digitalio.Pull.DOWN)

web2 = digitalio.DigitalInOut(web2_pin)
web2.switch_to_input(digitalio.Pull.DOWN)

web3 = digitalio.DigitalInOut(web3_pin)
web3.switch_to_input(digitalio.Pull.DOWN)

web4 = digitalio.DigitalInOut(web4_pin)
web4.switch_to_input(digitalio.Pull.DOWN)

web5 = digitalio.DigitalInOut(web5_pin)
web5.switch_to_input(digitalio.Pull.DOWN)

modo = 0
#Inicio de programa principal
while True:
    if micro.value:
        if modo == 0:
            print("Micrófono modo zoom")
            keyboard.press(Keycode.ALT, Keycode.A)
            time.sleep(0.1)
            keyboard.release(Keycode.ALT, Keycode.A)
            time.sleep(0.1)
        else:
            print("Micrófono modo meet")
            keyboard.press(Keycode.CONTROL, Keycode.D)
            time.sleep(0.1)
            keyboard.release(Keycode.CONTROL, Keycode.D)
            time.sleep(0.1)
    if camara.value:
        if modo == 0:
            print("Cámara modo zoom")
            keyboard.press(Keycode.ALT, Keycode.V)
            time.sleep(0.1)
            keyboard.release(Keycode.ALT, Keycode.V)
            time.sleep(0.1) 
        else:
            print("Cámara modo meet")
            keyboard.press(Keycode.CONTROL, Keycode.E)
            time.sleep(0.1)
            keyboard.release(Keycode.CONTROL, Keycode.E)
            time.sleep(0.1)       
    if pantalla.value:
        print("pantalla")
        keyboard.press(Keycode.ALT, Keycode.S)
        time.sleep(0.1)
        keyboard.release(Keycode.ALT, Keycode.S)
        time.sleep(0.1)
    if record.value:
        print("grabación")
        keyboard.press(Keycode.ALT, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.ALT, Keycode.R)
        time.sleep(0.1)
    if chat.value:
        if modo == 0:
            print("chat zoom")
            keyboard.press(Keycode.ALT, Keycode.H)
            time.sleep(0.1)
            keyboard.release(Keycode.ALT, Keycode.H)
            time.sleep(0.1)
        else:
            print("chat meet")
            keyboard.press(Keycode.CONTROL, Keycode.ALT, Keycode.C)
            time.sleep(0.1)
            keyboard.release(Keycode.CONTROL, Keycode.ALT, Keycode.C)
            time.sleep(0.1)
    if fin.value:
        print("fin de reunión")
        keyboard.press(Keycode.ALT, Keycode.Q)
        time.sleep(0.1)
        keyboard.release(Keycode.ALT, Keycode.Q)
        time.sleep(0.1)
    if word.value:
        print("word")
        keyboard.press(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard_layout.write("winword\n")
        time.sleep(0.1)
    if paint.value:
        print("paint")
        keyboard.press(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard_layout.write("mspaint\n")
        time.sleep(0.1)
    if outlook.value:
        print("cambio de modo")
        if modo == 1:
            modo = 0;
            time.sleep(0.1)
        else:
            modo = 1;
            time.sleep(0.1)
        time.sleep(0.1)
    if web1.value:
        print(pagina1)
        keyboard.press(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard_layout.write(pagina1+"\n")
        time.sleep(0.1)
    if web2.value:
        print(pagina2)
        keyboard.press(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard_layout.write(pagina2+"\n")
        time.sleep(0.1)
    if web3.value:
        print(pagina3)
        keyboard.press(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard_layout.write(pagina3+"\n")
        time.sleep(0.1)
    if web4.value:
        print(pagina4)
        keyboard.press(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard_layout.write(pagina4+"\n")
        time.sleep(0.1)
    if web5.value:
        print(pagina5)
        keyboard.press(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard.release(Keycode.GUI, Keycode.R)
        time.sleep(0.1)
        keyboard_layout.write(pagina5+"\n")
        time.sleep(0.1)
    time.sleep(0.1)
