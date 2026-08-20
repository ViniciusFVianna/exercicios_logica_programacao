#include <stdio.h>
#include <string.h>

int main() {
    char input[100];
    int month;

    printf("Digite o número do mês (1 a 12): ");
    
    if (fgets(input, sizeof(input), stdin) == NULL) {
        printf("Operação cancelada.\n");
        return 1;
    }

    input[strcspn(input, "\n")] = '\0';

    if (strlen(input) == 0) {
        printf("Operação cancelada.\n");
        return 1;
    }

    if (sscanf(input, "%d", &month) != 1) {
        printf("Erro: Entrada inválida. Por favor, digite apenas números inteiros.\n");
        return 1;
    }

    char *season = "Mês inválido";
    
    switch (month) {
        case 12:
        case 1:
        case 2:
            season = "Verão";
            break;
        case 3:
        case 4:
        case 5:
            season = "Outono";
            break;
        case 6:
        case 7:
        case 8:
            season = "Inverno";
            break;
        case 9:
        case 10:
        case 11:
            season = "Primavera";
            break;
        default:
            season = "Mês inválido";
            break;
    }

    if (strcmp(season, "Mês inválido") == 0) {
        printf("Aviso: Por favor, digite um número válido entre 1 e 12.\n");
    } else {
        printf("Resultado: A estação predominante no mês %d é:\n%s\n", month, season);
    }

    return 0;
}