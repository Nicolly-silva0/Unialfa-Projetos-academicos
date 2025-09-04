// Importa a classe Scanner para poder ler dados digitados pelo usuário
import java.util.Scanner; 


public class IMC { // Declaração da classe principal chamada "IMC"
    public static void main(String[] args) { // Método principal
        
        // Cria um objeto Scanner para capturar entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

         // Solicita o peso do usuário em quilogramas
        System.out.println("Qual seu peso(KG)? ");
        double peso = scanner.nextDouble();  // Lê o peso digitado, do tipo double

         // Solicita a altura do usuário em metros
        System.out.println("Qual sua altura(M)? ");
        double altura = scanner.nextDouble(); // Lê a altura digitada, do tipo double

        // Calcula o IMC usando a fórmula: peso dividido pela altura ao quadrado
        double imc = peso / (altura * altura);
        
        // Exibe o IMC com duas casas decimais
        System.out.printf("Seu IMC é: %.2f\n", imc);

         // Estrutura condicional que classifica o IMC do usuário com base na tabela da OMS
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Você está no peso normal.");
        } else if (imc < 30) {
            System.out.println("Você está em sobrepeso.");
        } else if (imc < 35) {
            System.out.println("Você está em obesidade grau 1.");
        } else if (imc < 40) {
            System.out.println("Você está em obesidade grau 2.");
        } else {
            System.out.println("Você está em obesidade grau 3.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}