#Ejercicio3.14
def Ejercicio11():
  #Inicio
  print("Buen dia tenga usteds estumado estudiante")
  #Datos de entrada
  Nota=int(input("Ingrese su nota porfavor:"))
  #Proceso
  NotaP=Nota>10
  NotaP1=Nota==10
  NotaP2=Nota==9
  NotaP3=Nota==8
  NotaP4=Nota==7 and Nota==6
  NotaP5=Nota>=0 and Nota<=5
  if NotaP:
    print("Esta nota no es valida")
  elif NotaP1:
    NotaP1=A
  elif NotaP2:
    NotaP2=B
  elif NotaP3:
    NotaP3=C
  elif NotaP4:
    NotaP4=D
  elif NotaP5:
    NotaP5=F
  
  print("Su nota es de:",NotaP, NotaP1, NotaP2, NotaP3, NotaP4, NotaP5)
Ejercicio11()