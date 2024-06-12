import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Coloque o preço do ingreço \n");
        Scanner sc = new Scanner(System.in);
        
        double valor = sc.nextDouble(); //salva o preco
        
        System.out.println("Coloque a classificação do fime \n");
        int classificacao = sc.nextInt(); //salva a classificacao
        
        sc.close();

        if(valor >= 12 && classificacao == 5) // compara se os dois valores são verdadeiros 
        {
            System.out.println("Estou interessado em assistir o filme");
        }
        else
        {
            System.out.println("Não estou interessado em assistir o filme");
        }
    }
}
