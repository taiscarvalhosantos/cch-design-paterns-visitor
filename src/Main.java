
public class Main {
    public static void main(String[] args) {

        Predio predio1 = new PredioResidencial("Edifício Sol Nascente");
        Predio predio2 = new Banco("Banco do Brasil");
        Predio predio3 = new Cafeteria("Café Expresso");
        Predio predio4 = new PredioResidencial("Condomínio Flores");
        Predio predio5 = new Banco("Caixa Econômica Federal");

        CorretorDeSeguros meuCorretor = new CorretorDeSeguros("João da Silva");


        System.out.println("--- Início das visitas ---");
        predio1.aceitar(meuCorretor);
        predio2.aceitar(meuCorretor);
        predio3.aceitar(meuCorretor);
        predio4.aceitar(meuCorretor);
        predio5.aceitar(meuCorretor);
        System.out.println("--- Fim das visitas ---");
    }
}