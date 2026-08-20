const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Digite o número do mês (1 a 12): ', (input) => {
    
    if (!input || input.trim() === '') {
        console.log('Operação cancelada.');
        rl.close();
        return;
    }

    const month = parseInt(input, 10);

    if (isNaN(month)) {
        console.error('Erro: Entrada inválida. Por favor, digite apenas números.');
        rl.close();
        return;
    }

    let season = "Mês inválido";
    switch (month) {
        case 12: case 1: case 2:
            season = "Verão";
            break;
        case 3: case 4: case 5:
            season = "Outono";
            break;
        case 6: case 7: case 8:
            season = "Inverno";
            break;
        case 9: case 10: case 11:
            season = "Primavera";
            break;
    }

    if (season === "Mês inválido") {
        console.warn('Aviso: Por favor, digite um número válido entre 1 e 12.');
    } else {
        console.log(`Resultado: A estação predominante no mês ${month} é:\n${season}`);
    }

    rl.close();
});