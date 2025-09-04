import java.util.Scanner; // Importa a classe scanner para ler entrada do usuário 
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); // Cria um objeto scanner


        // Solicita os três números
        System.out.println("Digite o perimeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        // Faz o cálculo dos números
        int produto = numero1 * numero2 * numero3;

        // Mostra o resultado
        System.out.println("O valor dos números é: "+produto);

        // Fecha o sacnner
        scanner.close(); 
    }
}