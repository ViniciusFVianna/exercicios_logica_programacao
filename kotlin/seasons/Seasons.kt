import javax.swing.JOptionPane

fun main() {
    val input = JOptionPane.showInputDialog(
        null,
        "Digite o número do mês (1 a 12):",
        "Estação do Ano",
        JOptionPane.QUESTION_MESSAGE
    )

    if (input.isNullOrBlank()) {
        JOptionPane.showMessageDialog(null, "Operação cancelada.")
        return
    }

    val month = input.toIntOrNull()

    val season = when(month) {
        12, 1, 2 -> "Verão"
        3, 4, 5 -> "Outono"
        6, 7, 8 -> "Inverno"
        9, 10, 11 -> "Primavera"
        else -> "Mês inválido"
    }

    if (season == "Mês inválido") {
        JOptionPane.showMessageDialog(
            null, 
            "Entrada inválida. Por favor, digite um número válido entre 1 e 12.", 
            "Erro", 
            JOptionPane.ERROR_MESSAGE
        )
    } else {
        JOptionPane.showMessageDialog(
            null, 
            "A estação predominante no mês $month é:\n$season",
            "Resultado", 
            JOptionPane.INFORMATION_MESSAGE
        )
    }
}