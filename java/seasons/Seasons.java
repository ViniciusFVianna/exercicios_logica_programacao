import javax.swing.*;

public class seasons {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                null,
                "Olá!\nGostaria de saber a estação do ano?",
                "Digite o número do mes (1 a 12):",
                JOptionPane.QUESTION_MESSAGE
        );

        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null, 
                "Operação cancelada."
                );
            return;
        }

        try {
            int month = Integer.parseInt(input.trim());

            String season = switch (month) {
                case 12, 1, 2 -> "Verão";
                case 3, 4, 5 -> "Outono";
                case 6, 7, 8 -> "Inverno";
                case 9, 10, 11 -> "Primavera";
                default -> "Mês inválido";
            };

            if (season.equals("Mês inválido")) {
                JOptionPane.showMessageDialog(null, 
                    "Por favor, digite um número válido entre 1 e 12.", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, 
                    "A estação predominante no mês " + month + " é:\n" + season,
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Entrada inválida! Digite apenas números inteiros.",
                    "Erro de Formato",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
