public class MainVotometro {
    public static void main(String[] args) {
        VotometroLogic user1 = new VotometroLogic();
        try {
            user1.pergunta1();
            Thread.sleep(1250);

            user1.pergunta2();
            Thread.sleep(1250);

            user1.pergunta3();
            Thread.sleep(1250);

            user1.pergunta4();
            Thread.sleep(1250);

            user1.pergunta5();
            Thread.sleep(1250);

            user1.pergunta6();
            Thread.sleep(1250);

            user1.pergunta7();
            Thread.sleep(1250);

            user1.pergunta8();
            Thread.sleep(1250);

            user1.pergunta9();
            Thread.sleep(1250);

            user1.pergunta10();
            Thread.sleep(1250);

        } catch (InterruptedException e) {
            System.out.println("Erro no temporizador: " + e.getMessage());
        }


        System.out.println(user1);

    }
}
