// Generar número secreto aleatorio
const numeroSecreto = Math.floor(Math.random() * 100) + 1;

// Variables globales
let intentos = 0;
let numerosIntroducidos = [];

// Función para adivinar el número
function adivinarNumero() {
  const input = document.getElementById("numero");
  const numero = parseInt(input.value);

  // Verificar si el número es válido
  if (isNaN(numero) || numero < 1 || numero > 100) {
    document.getElementById("mensaje").textContent =
      "Introduce un número válido del 1 al 100.";
    return;
  }

  // Añadir el número introducido a la lista
  numerosIntroducidos.push(numero);

  // Incrementar el contador de intentos
  intentos++;

  // Verificar si se ha adivinado el número secreto
  if (numero === numeroSecreto) {
    document.getElementById("mensaje").textContent =
      "Felicidades, adivinaste el número secreto.";
    document.getElementById("adivinar").disabled = true;
  } else {
    document.getElementById("mensaje").textContent =
      "Ups, el número secreto es incorrecto, vuelve a intentarlo.";
  }

  // Actualizar la lista de números introducidos
  const lista = document.getElementById("numerosIntroducidos");
  const item = document.createElement("li");
  item.textContent = numero;
  lista.appendChild(item);

  // Limpiar el input
  input.value = "";
}

document.getElementById("adivinar").onclick = adivinarNumero;