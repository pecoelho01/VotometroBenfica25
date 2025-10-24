# 🗳️ Votómetro Benfica 25

O Votómetro Benfica 25 é um pequeno projeto desenvolvido por diversão com alguns amigos — uma espécie de votómetro ao estilo da política, mas adaptado às eleições do Sport Lisboa e Benfica.

Sendo benfiquista, quis descobrir, através de um conjunto de perguntas, qual dos candidatos era mais próximo das minhas opiniões. Para isso, desenvolvi um programa que, com base num algoritmo simples, analisa as respostas e indica o candidato com o qual o utilizador mais se identifica.


---

## 📁 Estrutura do Projeto

```
VotometroBenfica25/
├── MainVotometro.java      # Ponto de entrada do programa
├── VotometroLogic.java     # Lógica principal do votómetro e perguntas
└── Candidatos.java         # Classe que representa cada candidato e respetiva pontuação
```

---

## ▶️ Como Executar

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/teu-username/votometro-benfica25.git
   cd votometro-benfica25
   ```

2. **Compilar os ficheiros Java:**
   ```bash
   javac *.java
   ```

3. **Executar o programa:**
   ```bash
   java MainVotometro
   ```

4. **Responder às perguntas:**
   O utilizador deve responder com valores entre `-2` e `2` consoante o grau de concordância.

---

## 🧮 Exemplo de Execução

```
Bem-vindo ao Votómetro Benfica 25!
1 - O Benfica deve reduzir o número de contratações e apostar fortemente na formação.
2 : Concordo Totalmente
1 : Concordo
0 : Neutro
-1 : Discordo
-2 : Discordo Totalmente
Qual a sua opção de 2 a -2: 1

[...]

ESTES SÃO OS SEUS RESULTADOS:
João Noronha Lopes
:::::::::::::::::::::::::::::::::::::::::::::::78.0%
Rui Costa
:::::::::::::::::::::::::::::::55.0%
Luis Filipe Vieira
::::::::::::::::::42.0%
```

---

## 📊 Lógica do Algoritmo

Cada candidato tem uma resposta “ideal” para cada uma das 10 perguntas.  
O programa compara as respostas do utilizador com as dos candidatos e calcula uma pontuação com base na **proximidade** entre as opiniões.  
O resultado final é apresentado em percentagem, ordenado do candidato mais compatível ao menos compatível.

NOTA: As posições dos candidatos em relação a cada pergunta tiveram com base uma análise feita pela LLM ChatGPT que analisou os 6 Programas Eleitorais.

---

## 👤 Autor
**Pedro**  
Estudante de Engenharia Informática — ISCTE-IUL  
2025  