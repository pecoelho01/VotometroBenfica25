
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotometroLogic {
    private double [] user;
    private final Scanner sc = new Scanner(System.in);

    
    public VotometroLogic() {
        user = new double[6];
    }

    public void options() {
        System.out.println("2 : Concordo Totalmente");
        System.out.println("1 : Concordo ");
        System.out.println("0 : Neutro");
        System.out.println("-1 : Discordo");
        System.out.println("-2 : Discordo Totalmente");
    }

    public int checkOption () {      
        int opcao = sc.nextInt();

        while (opcao != -2 && opcao != -1 && opcao != 0 && opcao != 1 && opcao != 2) {
            System.out.println("Erro, repita: Qual a sua opção de 2 a -2: ");
            opcao = sc.nextInt();
            
        } 
        return opcao;
    }

    public void pergunta1() {
        System.out.println("1 - O Benfica deve reduzir o número de contratações e apostar fortemente na estabilidade do plantel e formação.");
        options();
        
        System.out.println("Qual a sua opção de 2 a -2: ");
        int opcao = checkOption();

        int [] candidatosEscolha = {1,1,1,0,2,2};  

        contasPergunta(opcao, candidatosEscolha, user);
    }

    public void pergunta2() {
        System.out.println( "2 - O Presidente deve ter controlo total sobre o futebol e ser o rosto principal de todas as decisões desportivas.");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");
        int opcao = checkOption();

        int [] candidatosEscolha = {1,-1,-2,2,-1,-2};   

        contasPergunta(opcao, candidatosEscolha, user);

        
    }

    public void pergunta3() {
        System.out.println("3 - O Benfica deve apostar num modelo empresarial e global, mesmo que isso afaste o clube da base associativa.");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");
        int opcao = checkOption();

        int [] candidatosEscolha = {1,-2,-2,2,-1,1};  

        contasPergunta(opcao, candidatosEscolha, user);

    }

    public void pergunta4() {
        System.out.println("4 - O clube deve aumentar o investimento no futebol feminino e nas modalidades, mesmo que o orçamento do futebol masculino diminua.");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");
        int opcao = checkOption();

        int [] candidatosEscolha = {0,1,2,-1,1,1};  

        contasPergunta(opcao, candidatosEscolha, user);

    }

    public void pergunta5() {
        System.out.println("5 - O Benfica deve romper com o sistema de poder do futebol português, mesmo que isso traga conflitos com FPF e Liga.");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");
      
        int opcao = checkOption();;

        int [] candidatosEscolha = {0,2,1,2,1,0};  

        contasPergunta(opcao, candidatosEscolha, user);


    }

    public void pergunta6() {
        System.out.println("6 - O Benfica deve abrir as finanças e decisões à fiscalização dos sócios, com transparência total em transferências e contratos.");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");

        int opcao = checkOption();

        int [] candidatosEscolha = {0,2,2,-2,2,1};  

        contasPergunta(opcao, candidatosEscolha, user);

     
    }

    public void pergunta7() {
        System.out.println("7 - O clube deve profissionalizar a gestão, separando o papel político (Presidente) do papel técnico (Diretor-Geral do Futebol).");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");
       
        int opcao = checkOption();

        int [] candidatosEscolha = {1,2,1,-1,2,2};  

        contasPergunta(opcao, candidatosEscolha, user);

       
    }

    public void pergunta8(){
        System.out.println("8 - As Casas do Benfica devem ter poder e voto efetivo nas decisões centrais do clube.");
        options();
        System.out.println("Qual a sua opção de 2 a -2: ");
 
        int opcao = checkOption();

        int [] candidatosEscolha = {1,-2,-2,2,1,0};  

        contasPergunta(opcao, candidatosEscolha, user);


    }
    
    public void pergunta9() {
        System.out.println("9 - O Benfica deve permitir investimento externo minoritário na SAD, desde que mantenha o controlo e reforçe a competitividade.");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");
    
        int opcao = checkOption();

        int [] candidatosEscolha = {0,-2,-1,2,1,0};  

        contasPergunta(opcao, candidatosEscolha, user);

 
    }

    public void pergunta10() {
        System.out.println("10 - A limitação de mandatos (a dois seguidos) é algo bom e evita a dependência de figuras");
        options();

        System.out.println("Qual a sua opção de 2 a -2: ");
     
        int opcao = checkOption();

        int [] candidatosEscolha = {-2,2,2,-2,1,1};  

        contasPergunta(opcao, candidatosEscolha, user);

    
    }

    public void contasPergunta(int opcao, int [] candidatos, double [] user) {
        for ( int i = 0; i < candidatos.length; i++) {
            int temporary = Math.abs(opcao - candidatos[i]);
            user[i] += (1 - (temporary/4.0));
        }
    }

    public double [] getUserResults() {
        return user;
    }

    public void contasFinais(double [] user) {
        for ( int i = 0; i < user.length; i++) {
            user[i] = (user[i] / 10.0) * 100;
        }
    }

    @Override
    public String toString() {
        contasFinais(user);
        StringBuilder st = new StringBuilder();
        st.append("ESTES SÃO OS SEUS RESULTADOS:\n");

        List<Candidatos> finalResultados = new ArrayList<>();

        finalResultados.add(new Candidatos("Rui Costa", user[0]));
        finalResultados.add(new Candidatos("João Diogo Manteigas", user[1]));
        finalResultados.add(new Candidatos("João Noronha Lopes", user[2]));
        finalResultados.add(new Candidatos("Luis Filipe Vieira", user[3]));
        finalResultados.add(new Candidatos("Cristovão Carvalho", user[4]));
        finalResultados.add(new Candidatos("Mayer M", user[5]));


        finalResultados.sort((a,b) -> {
            return Double.compare(b.getResult(), a.getResult() );
        });
        for ( Candidatos cand: finalResultados) {
            st.append(cand.getName() + "\n");

            for ( int i = 0; i < (int) cand.getResult(); i++) {
                st.append(":");
            }

            st.append(cand.getResult() + "%\n");
            
        }

        return st.toString();
    }

    
}
