from random import *

def gera_dado ():
  return randint(1, 6), randint(1, 6)

def inicio():
  return print("\n\n=============== CRAPS ================")

def estagio_um():
    dado1, dado2 = gera_dado()
    pontos = dado1 + dado2
  
    if (pontos == 7) or (pontos == 11):
       print("\nDado 1: ", dado1, "\nDado 2: ", dado2, "\nPonto: ", pontos, "\n\nVocê ganhou!!!\n\n")  
       sentinela = int(input("\n Voce quer continuar? (0 para sair e 1 para continuar): "))
    elif (pontos == 2) or (pontos == 3) or (pontos == 12):
       print("\nDado 1: ", dado1, "Dado 2: ", dado2, "\nPonto: ", pontos, "\n\nVoce perdeu!")
       sentinela = int(input("\n Voce quer continuar? (0 para sair e 1 para continuar): "))
   
    else:
       print("\nDado 1: ", dado1, "Dado 2: ", dado2, "\nPonto: ", pontos)
       print("\n\nIniciando estagio 2...")
       secundo_estagio(pontos)

def secundo_estagio(meta):
     jogada = 1
     dado1, dado2 = gera_dado()
     pontos = dado1 + dado2

     if (pontos == 7):
       print("\nJogada: ", jogada, "\nDado 1: ", dado1, "Dado 2: ", dado2, "\nPonto: ", pontos)
       print("\n\nVoce perdeu!!")
       sentinela = int(input("\nVoce quer continuar? (0 para sair e 1 para continuar): "))

     elif (pontos == meta):
       print("\n\nJogada: ", jogada, "\nDado 1: ", dado1, "Dado 2: ", dado2, "\nPontos: ", pontos, "\n\nVoce ganhou!!")
       sentinela = int(input("\nVoce quer continuar? (0 para sair e 1 para continuar): "))

     else: 
       print("\n\nJogada: ", jogada, "\nDado 1: ", dado1, "Dado 2: ", dado2, "\nPontos: ", pontos)
      
     jogada+1
     
sentinela = 1

while (sentinela == 1): 
  if (sentinela == 1):
    inicio()
    estagio_um()
  else:
    exit(-1) 
