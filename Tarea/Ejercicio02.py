#ejercicio2 en la tarea
def ejercicio07():
  print ("Bono por antiguedad en la tienda")
  #ingreso de datos
  tiempoA=int(input("Ingrese cuantos años lleva en la tienda trabajando:"))
  bonoF=0
  mensaje=''
  #proceso
  if tiempoA >= 1 and tiempoA < 2:
    bonoF=100
    mensaje=f"El bono que recibirá es un total de {bonoF} dolares"
  elif tiempoA >= 2 and tiempoA < 3:
    bonoF=200
    mensaje=f"El bono que recibirá es un total de {bonoF} dolares"
  elif tiempoA >= 3 and tiempoA < 4:
    bonoF=300
    mensaje=f"El bono que recibirá es un total de {bonoF} dolares"
  elif tiempoA >= 4 and tiempoA < 5:
    bonoF=400
    mensaje=f"El bono que recibirá es un total de {bonoF} dolares"
  elif tiempoA == 5:
    bonoF=500
    mensaje=f"El bono que recibirá es un total de {bonoF} dolares"
  elif tiempoA > 5:
    bonoF=1000
    mensaje=f"El bono que recibirá es un total de {bonoF} dolares"
  else:
    mensaje="El dato que ingresó son negativos o inexistentes"
  print (mensaje)
ejercicio07()