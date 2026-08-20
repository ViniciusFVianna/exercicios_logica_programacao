import 'dart:io';

void main() {
  stdout.write('Digite o número do mês (1 a 12): ');
  
  String? input = stdin.readLineSync();

  if (input == null || input.trim().isEmpty) {
    print('Operação cancelada.');
    return;
  }

  int? month = int.tryParse(input);

  if (month == null) {
    print('Erro: Entrada inválida. Por favor, digite apenas números inteiros.');
    return;
  }

  String season = switch (month) {
    12 || 1 || 2 => 'Verão',
    3 || 4 || 5  => 'Outono',
    6 || 7 || 8  => 'Inverno',
    9 || 10 || 11 => 'Primavera',
    _ => 'Mês inválido'
  };

  if (season == 'Mês inválido') {
    print('Aviso: Por favor, digite um número válido entre 1 e 12.');
  } else {
    print('Resultado: A estação predominante no mês $month é:\n$season');
  }
}