Fase 1: Sorteie 100 números aleatórios de 1 a 9. Crie 3 pilhas dinâmicas em Java, sendo que a pilha 1 vai armazenar os números sorteados de 1 a 3, a pilha 2 vai armazenar os números sorteados de 4 a 6 e a pilha 3 vai armazenar os números sorteados de 7 a 9. 

Fase 2: Após inserir os 100 números nas pilhas (provavelmente elas terão tamanhos distintos), sorteie outros 100 números aleátórios de 1 a 3. Esse número vai indicar qual pilha será utilizada para receber o número que estiver no topo das outras duas pilhas.  Repita o processo até que uma das pilhas fique vazia ou até que os 100 números sorteados seja atingido. Ao final imprima as 3 pilhas. 

Obs.: Deve ser impresso os números que serão empilhados na pilha sorteada conforme o exemplo abaixo. 

Exemplo: (Números sorteados na fase 1)

Pilha 1:                                                               Pilha 2:                                                                      Pilha 3:

1                                                                           4                                                                                  

2                                                                           5                                                                                   8

3                                                                           6                                                                                   9

(fase 2: Suponha que seja sorteado o número 1. Seu programa deverá imprimir: )

"Empilhando os números 4 e 8 na pilha 1"

Pilha 1:                                                               Pilha 2:                                                                      Pilha 3:

8

4

1                                                                                                                                                         

2                                                                           5                                                                                   

3                                                                           6                                                                                   9

(fase 2: Suponha que seja sorteado o número 2. Seu programa deverá imprimir: )

"Empilhando os números 8 e 9 na pilha 2"

Pilha 1:                                                               Pilha 2:                                                                      Pilha 3:

4                                                                           9

1                                                                           8                                                                             

2                                                                           5                                                                                   

3                                                                           6                                                                                   

"O programa foi encerrado porque a pilha 3 está vazia"
(Caso seja por ter atingido o total de números sorteados, indicar isso na mensagem de encerramento do programa)