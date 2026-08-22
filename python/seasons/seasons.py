entrada = input("Digite o número do mês (1 a 12): ")

if not entrada.strip():
  print("Operação cancelada.")
else:
  if entrada.isdigit():
    month = int(entrada)
  else:
    month = None

  if month in (12, 1, 2):
    season = "Verão"
  elif month in (3, 4, 5):
    season = "Outono"
  elif month in (6, 7, 8):
    season = "Inverno"
  elif month in (9, 10, 11):
    season = "Primavera"
  else:
    season = "Mês inválido"

  if season == "Mês inválido":
    print("Erro: Entrada inválida. Por favor, digite um número válido entre 1 e 12.")
  else:
    print(f"A estação predominante no mês {month} é:\n{season}")