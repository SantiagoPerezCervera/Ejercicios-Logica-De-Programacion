// Solicitar al usuario la temperatura en grados Celsius
let temperaturaCelsius;

// Convertir de Celsius a Fahrenheit
let temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

// Convertir de Celsius a Kelvin
let temperaturaKelvin = temperaturaCelsius + 273.15;

// Imprimir resultados
console.log(`Grados Fahrenheit: ${temperaturaFahrenheit}`);
console.log(`Grados Kelvin: ${temperaturaKelvin}`);

// Obtener referencias a los elementos del DOM
const temperaturaInput = document.getElementById("temperatura-input");
const calcularBtn = document.getElementById("calcular-btn");
const resultadoFahrenheit = document.getElementById("resultado-fahrenheit");
const resultadoKelvin = document.getElementById("resultado-kelvin");

// Agregar listener al botón para calcular los resultados
calcularBtn.addEventListener("click", () => {
  // Obtener la temperatura en Celsius ingresada por el usuario
  const temperaturaCelsius = Number(temperaturaInput.value);

  // Verificar que el valor ingresado sea un número válido
  if (isNaN(temperaturaCelsius)) {
    alert("Ingresa un número válido.");
    return;
  }

  // Convertir de Celsius a Fahrenheit
  const temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

  // Convertir de Celsius a Kelvin
  const temperaturaKelvin = temperaturaCelsius + 273.15;

  // Actualizar los contenidos de los divs con los resultados
  resultadoFahrenheit.textContent = `Grados Fahrenheit: ${temperaturaFahrenheit}`;
  resultadoKelvin.textContent = `Grados Kelvin: ${temperaturaKelvin}`;
});