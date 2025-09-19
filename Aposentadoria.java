
import javax.swing.JOptionPane;

public class Aposentadoria {

    public static void main(String[] args) {
        try {
            // Entrada de dados
            String sexo = JOptionPane.showInputDialog("Informe seu sexo (M para masculino / F para feminino):").toUpperCase();
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
            int tempoContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Informe seu tempo de contribuição (em anos):"));

            // Definir limites com base no sexo
            int idadeMinima = (sexo.equals("F")) ? 60 : 65;
            int contribuicaoMinima = (sexo.equals("F")) ? 30 : 35;

            // Verificar se tem direito a se aposentar
            boolean aposentaPorIdade = idade >= idadeMinima;
            boolean aposentaPorContribuicao = tempoContribuicao >= contribuicaoMinima;

            if (aposentaPorIdade || aposentaPorContribuicao) {
                JOptionPane.showMessageDialog(null, "Você já tem o direito a se aposentar.");
            } else {
                // Calcular o que falta para atingir cada requisito
                int faltaIdade = idadeMinima - idade;
                int faltaContribuicao = contribuicaoMinima - tempoContribuicao;

                StringBuilder mensagem = new StringBuilder("Você ainda não tem direito a se aposentar.\n");

                if (faltaIdade > 0) {
                    mensagem.append("Faltam ").append(faltaIdade).append(" anos para atingir a idade mínima.\n");
                }

                if (faltaContribuicao > 0) {
                    mensagem.append("Faltam ").append(faltaContribuicao).append(" anos de contribuição.");
                }

                JOptionPane.showMessageDialog(null, mensagem.toString());
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
