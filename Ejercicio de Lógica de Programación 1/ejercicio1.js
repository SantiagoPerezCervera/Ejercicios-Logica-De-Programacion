function ordenarNumeros() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    let num3 = parseFloat(document.getElementById("num3").value);
  
    if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
      alert("Ingrese solo números");
      return;
    }
  
    let mayor, medio, menor;
  
    if (num1 >= num2 && num1 >= num3) {
      mayor = num1;
      if (num2 >= num3) {
        medio = num2;
        menor = num3;
      } else {
        medio = num3;
        menor = num2;
      }
    } else if (num2 >= num1 && num2 >= num3) {
      mayor = num2;
      if (num1 >= num3) {
        medio = num1;
        menor = num3;
      } else {
        medio = num3;
        menor = num1;
      }
    } else {
      mayor = num3;
      if (num1 >= num2) {
        medio = num1;
        menor = num2;
      } else {
        medio = num2;
        menor = num1;
      }
    }
  
    let resultado1 = document.getElementById("resultado1");
    resultado1.textContent = mayor + ", " + medio + ", " + menor;
  
    let resultado2 = document.getElementById("resultado2");
    resultado2.textContent = menor + ", " + medio + ", " + mayor;
  
    if (num1 === num2 && num2 === num3) {
      alert("Los números ingresados son iguales");
    }
  }
  document.getElementById("ordenar").onclick = ordenarNumeros;