velha = [
    [" "," "," "],
    [" "," "," "],
    [" "," "," "]
]
quemjoga= 1
jogador ="x"

def tela():
    velha
    print("  " +  velha[0][0] + "|  " + velha[0][1] + "|" + velha[0][2] )
    print("------------")
    print("  " +  velha[1][0] + "|  " + velha[1][1] + "|" + velha[1][2] )
    print("------------")
    print("  " +  velha[2][0] + "|  " + velha[2][1] + "|" + velha[2][2] )


def jogar():
    linha = int(input("digite a linha:"))
    coluna = int(input("digite a coluna:"))
    while (velha[linha][coluna] != " "):
        print ("posição já preenchida")
        linha = int(input("digite a linha:"))
        coluna = int(input("digite a coluna:"))
    
    if quemjoga == 1:
        velha[linha][coluna] = "O"
        if ganhou("O"):
            return 3
        return 2
    else:
        velha[linha][coluna] = "X"
        if ganhou("X"):
            return 3
        return 1


def ganhou(jog):

    if velha[0][0] == jog and velha[0][1] == jog and velha[0][2] == jog:
        print("O vencedor foi " , jog )
        return True 
    elif velha[0][0] == jog and velha[1][0] == jog and velha[2][0] == jog:
        print("O vencedor foi " , jog )
        return True 
    elif velha[0][1] == jog and velha[1][1] == jog and velha[2][1] == jog:
        print("O vencedor foi " , jog )
        return True 
    elif velha[0][2] == jog and velha[1][2] == jog and velha[2][2] == jog:
        print("O vencedor foi " , jog )
        return True 
    if velha[0][0] == jog and velha[1][1] == jog and velha[2][2] == jog :
        print("O vencedor foi " , jog )
        return True 
    elif velha[0][2] == jog and velha[1][1] == jog and velha[2][0]==jog:
        print("O vencedor foi " , jog )
        return True 
    elif velha[1][0] == jog and velha[1][1] == jog and velha[1][2] == jog :
        print("O vencedor foi " , jog )
        return True 
    elif velha[2][0] == jog and velha[2][1] == jog and velha[2][2] == jog :
        print("O vencedor foi " , jog )
        return True 
    else:
        return False


for x in range(9):
    tela()
    quemjoga = jogar()
    if quemjoga == 3:
        print ("fim do jogo")
        break

