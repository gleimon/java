public class App {
    public static void main(String[] args) throws Exception {
       
        InteracaoUsuario iu = new InteracaoUsuario();

        Hotel meuHotel = new Hotel (3, 120.00);

        String valor = iu.entradaDados("Informe o número de diárias: ");
        int numeroDiarias = Integer.parseInt(valor);

        double valorCalculado = meuHotel.calculaDiarias(numeroDiarias);

        iu.mostraDados("O valor das diárias é R$: " +valorCalculado);

    }
}
