def estCondicional01():
  #Definir variables y otros
  print("Ejemplo estructura Condicional en Python")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad de lapices:"))
  #Proceso
  if cantidadX>=1000:
    montoP=cantidadX*0.80
  else:
    montoP=cantidadX*0.90
  #Datos de salida
  print("El monto a pagar es:", montoP)
def estCondicional02():
 #Definir variables y otros
 print("Ejemplo estructura Condicional en Python 02")
 montoP=0
 #Datos de entrada
 cantidadX=int(input("Ingrese la cantidad de personas:"))
 #Proceso
 if cantidadX<=200:
  montoP=cantidadX*95
 elif cantidadX>200 and cantidadX<=300:
  montoP=cantidadX*85
 else:
  montoP=cantidadX*75
 #Datos de salida
 print("El monto a pagar es:", montoP)
def votoElecciones():
  print ("Como saber si puedes votar por tu edad")
  mensaje=""
  edadP=int(input("ingrese la edad que tiene:"))
  if edadP>=18:
    mensaje="Usted tiene la edad necesaria para votar"
  else:
    mensaje="Usted no cumple con la edad minima para votar"
  print(mensaje)

def pagoSemanalBase40horas():
  print("Pago semanal de trabajador")
  sueldoPagarSem=0.0
  #Datos de entrada
  horasTra=int(input("Ingrese horas trabajadas a ala semana:"))
  horasPago=int(input("Ingrese el pago por hora:"))
  #Proceso
  if horasTra>40:
    sueldoPagarSem=40*horasPago+(horasTra-40)*2*horasPago
  else:
    sueldoPagarSem=horasTra*horasPago
  #Datos de salida
  print("El sueldo a pagar al trabajador es:",sueldoPagarSem)

def notaPostulanteEstMoltiple()
#estCondicional02()
#estCondicional02()
#votoElecciones()
pagoSemanalBase40horas()