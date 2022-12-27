nomes= []
telefones =[]
operacao =0

while operacao != 8 or operacao > 8 :
    print ("\nAGENDA TELEFONICA!!!\n\n1-LISTAR CONTATOS:\n2-INSERIR CONTATO:\n3-ALTERAR CONTATO:\n4-BUSCAR CONTATO:\n5-REMOVER CONTATO:\n6-SALVAR EM ARQUIVO DE TEXTO:\n7-GERAR HTML:\n8-SAIR:")
    operacao=int(input("sua escolha:\n"))

    if operacao == 2:
        n = input("digite o nome do seu contato:\n")
        numero = int(input("digite o numero do seu contato:"))
        nomes.append(n)
        telefones.append(numero)
        print("!CONTATO SALVO!\n")

    elif operacao == 1:
        print("\n!LISTA DE CONTATOS!\n")
        for x in range (0,len(nomes)):
            print(nomes[x]," ====== ",telefones[x])

    elif operacao == 3:
        encontrado = False
        escolha = input("alterar o contato de:")
        for x in range(0,len(nomes)):
            if nomes[x] == escolha:
                encontrado = True
                n = str(input("digite o novo nome do seu contato:"))
                numero = int(input("digite o novo numero do seu contato:"))
                nomes[x]= n
                telefones[x]= numero
                print("\n!CONTATO ALTERADO!\n")
        if not encontrado:
           print('\n!CONTATO NÃO ENCONTRADO!\n')

    elif operacao == 4:
        encontrado = False
        escolha= str(input("Quem você deseja buscar? "))
        for x in range(0,len(nomes)):
            if nomes[x] == escolha:
                encontrado = True
                print(nomes[x],"=====",telefones[x])
        if not encontrado:
            print('!CONTATO NÃO ENCONTRADO!\n')

    elif operacao == 5:
            encontrado = False
            escolha = input("quem deseja remover? ")
            for x in range(0,len(nomes)):
                if nomes[x] == escolha:
                    encontrado = True
                    nomes.remove(escolha)
                    print("\n!CONTATO REMOVIDO!")
            if not encontrado:
                print('!CONTATO NÃO ENCONTRADO!\n')
                
    elif operacao == 6:
        with open("agenda_telefonica.txt","w") as arquivo:
            arquivo.write("Lista telefonica!!")
            for x in range(0,len(nomes)):
                arquivo.write("\n")
                arquivo.write(str(nomes[x]))
                arquivo.write("----")
                arquivo.write(str(telefones[x]))
                arquivo.write("\n")
        print("GERADO ARQUIVO  DE TEXTO!!")
    elif operacao == 7:
        with open("agenda_telefonica.html","w") as arquivo:
            arquivo.write("<DOCTYPE!html>")
            arquivo.write("<html>")
            arquivo.write("<head>")
            arquivo.write("<title> listatelefonica </title>")
            arquivo.write("</head>")
            arquivo.write("<body>")
            arquivo.write("<table border = '1'>")
            
            for x in range(0,len(nomes)):
                arquivo.write("<tr>\n")
                arquivo.write("<td> \n")
                arquivo.write(str(nomes[x]))
                arquivo.write("----")
                arquivo.write(str(telefones[x]))
                arquivo.write("</td \n>")
            arquivo.write("\n")
            arquivo.write("</tr> \n")
            arquivo.write("</table> \n")
            arquivo.write("</html> \n")
            print("GERADO ARQUIVO HTML !!!")
            
    elif operacao > 8:
        print("!!!ESCOLHA UMA DAS OPÇÕES APRESENTADAS!!!")