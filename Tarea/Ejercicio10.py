#este es el ejercicio 3.12
def Ejercicio10():
  #Inicio
  print("Buenos dias")
  #Datos de entrada
  Sueldo=int(input("Ingrese su sueldo por hora:"))
  Horastrabajadas=float(input("Ingrese sus horas trabajadas:"))
  #Proceso
  Sueldototal=0.0
  if Horastrabajadas>0 and Horastrabajadas<=40:
    Sueldototal=(Sueldo*Horastrabajadas)
  elif Horastrabajadas>=41 and Horastrabajadas<=45:
    Sueldototal=((Sueldo*2)*Horastrabajadas)
  elif Horastrabajadas>=46 and Horastrabajadas<=50:
    Sueldototal=((Sueldo*3)*Horastrabajadas)
  elif Horastrabajadas>50:
    print("Las horas mayores a 50 no son validas")
  
  print("Su sueldo es de:",Sueldototal)
Ejercicio10()