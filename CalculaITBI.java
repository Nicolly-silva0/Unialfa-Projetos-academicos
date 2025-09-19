import javax.swing.JOptionPane;

public class CalculaITBI {
    public static void main(String[] args) {
        try {
            // Entrada dos dados usando JOptionPane
            String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor da transação:");
            double valorTransacao = Double.parseDouble(valorTransacaoStr.replace(",", "."));
            
            String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal de referência:");
            double valorVenal = Double.parseDouble(valorVenalStr.replace(",", "."));
            
            String percentualStr = JOptionPane.showInputDialog("Digite o percentual do imposto (%):");
            double percentual = Double.parseDouble(percentualStr.replace(",", "."));
            
            // Encontra o maior valor
            double baseCalculo = Math.max(valorTransacao, valorVenal);
            
            // Calcula o imposto
            double valorImposto = baseCalculo * percentual / 100.0;
            
            // Saída do resultado
            String mensagem = String.format("Valor do imposto a ser pago: R$ %.2f", valorImposto);
            JOptionPane.showMessageDialog(null, mensagem);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

