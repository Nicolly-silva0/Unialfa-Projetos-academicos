
import javax.swing.JOptionPane;

public class CalularMedia {
    public static void main(String[] args) {
        try {
            // Entrada das notas
            double prova1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 1:"));
            double prova2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 2:"));
            double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Trabalho:"));

            // Cálculo da média
            double media = (prova1 + prova2 + trabalho) / 3;

            // Verificação de aprovação
            String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

            // Exibição do resultado
            JOptionPane.showMessageDialog(null, String.format("Média: %.2f\nResultado: %s", media, resultado));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}


