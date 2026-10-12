const prompt = require('prompt-sync')();

var frutas = [];

function adicionarFruta(fruta) {
    console.log(`Adicionando fruta: ${fruta}`);
    frutas.push(fruta);
}

function indexarFrutas() {
    for (let i = 0; i < frutas.length; i++) {
        console.log(`Índice ${i}: ${frutas[i]}`);
    }
}

indexarFrutas();

while (frutas.length < 10) {
    var novaFruta = prompt("Digite o nome de uma fruta para adicionar (ou 'sair' para encerrar):");
    if (novaFruta.toLowerCase() === 'sair') {
        console.log("Encerrando o programa.");
        break;
    }
    adicionarFruta(novaFruta);
    indexarFrutas();
}