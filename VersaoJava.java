// Declaração da classe principal chamada VersaoJava
public class VersaoJava { 
        public static void main(String[] args) { // Método principal que é o ponto de entrada do programa

        // Obtém a versão do Java instalada no sistema usando uma propriedade do sistema
        String versaoJava = System.getProperty("java.version");

        // Exibe a versão do Java no console
        System.out.println("Versão do Java instalada: " + versaoJava);
    }
}