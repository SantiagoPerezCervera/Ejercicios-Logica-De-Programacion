function calcularFactorial() {
    const inputNumero = document.getElementById('numero');
    const resultadoElement = document.getElementById('resultado');
    const numero = Number(inputNumero.value);

    if (isNaN(numero) || numero < 0) {
        resultadoElement.textContent = 'El número ingresado no es válido';
        return;
    }

    let factorial = 1;
    for (let i = 2; i <= numero; i++) {
        factorial *= i;
    }

    resultadoElement.textContent = factorial;
}
document.getElementById("mostrar").onclick = calcularFactorial;