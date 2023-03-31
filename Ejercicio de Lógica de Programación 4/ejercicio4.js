function mostrarSerie() {
    const input = document.getElementById('input-number');
    const numero = parseInt(input.value);

    if (isNaN(numero)) {
      alert('Por favor, introduce un número válido.');
      return;
    }

    let serie = '';
    let a = 0;
    let b = 1;

    for (let i = 0; i < numero; i++) {
      serie += a + ', ';
      const siguiente = a + b;
      a = b;
      b = siguiente;
    }

    document.getElementById('resultado').textContent = serie.slice(0, -2);
  }
  document.getElementById("mostrar").onclick = mostrarSerie;