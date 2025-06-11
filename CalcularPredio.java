import java.util.Scanner;

public class CalcularPredio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do prédio:");
        double altura = scanner.nextDouble();
        System.out.print("Digite a quantidade de andares:");
        int andares = scanner.nextInt();
        
        System.out.println("Altura do predio eh "+altura*andares+" metros");
        scanner.close();
    }
}
