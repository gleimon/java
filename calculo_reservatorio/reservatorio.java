import java.util.Scanner;

public class reservatorio {
    public static void main(String args[]) {
        Scanner entrada_dados = new Scanner(System.in);
        float altura,largura, comprimento, cons_diario, cap_total, autonomia;

        System.out.println("Informe a altura do reservatorio: ");
        altura = entrada_dados.nextFloat();

        System.out.println("Informe a largura do reservatorio: ");
        largura = entrada_dados.nextFloat();

        System.out.println("Informe o comprimento do reservatorio: ");
        comprimento = entrada_dados.nextFloat();
        
        System.out.println("Informe o consumo diario: ");
        cons_diario = entrada_dados.nextFloat();

        cap_total = (altura * largura * comprimento);
        System.out.println("A capacidade total é: " +cap_total);

        autonomia = (cap_total / cons_diario);
        System.out.println("A autonomia em dias são: " +autonomia);

        if(autonomia < 2)
            System.out.println("Consumo Elevado");
        else
            if(autonomia > 7)
                System.out.println("Consumo Reduzido");
            else 
                System.out.println("Consumo Moderado");

        entrada_dados.close();
    }
}