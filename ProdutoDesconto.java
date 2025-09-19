import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProdutoDesconto {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Valor do produto: ");
            String valorProdutoStr = reader.readLine();
            double valorProduto = Double.parseDouble(valorProdutoStr);
        
            System.out.print("Digite o valor do desconto: ");
            String porcentagemDescontoStr = reader.readLine();
            double porcentagemDesconto = Double.parseDouble(porcentagemDescontoStr);

            double valorDesconto = valorProduto * (porcentagemDesconto / 100);
            double valorFinal = valorProduto - valorDesconto;

            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Valor com desconto: R$ %.2f%n", valorFinal);
            
        } catch (IOException e) {
            System.out.println("Erro na leitura dos dados.");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite números válidos.");
        }
    }
    
}
