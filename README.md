<img width="832" height="269" alt="image" src="https://github.com/user-attachments/assets/8172b81e-dae6-45cb-92ab-2fe1e9d8d242" />
 Inventario de Bodega de Vinos

 Descripción

El programa utiliza una clase llamada `Vino` para guardar la información de un vino y controlar la cantidad de botellas disponibles.

También permite vender botellas y reponer el stock cuando sea necesario.

Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos.
 Constructores.
 Métodos.
 Validación de datos.
 Control de stock.

 Clase Vino

La clase `Vino` tiene los siguientes atributos:

 `etiqueta`: nombre o etiqueta del vino.
 `varietal`: tipo de uva del vino, por ejemplo Malbec o Cabernet Franc.
 `precio`: precio de cada botella.
 `stockBotellas`: cantidad de botellas disponibles.

## Constructor

El constructor recibe los datos necesarios para crear un vino.

También se controla que el stock inicial no sea menor que `0`.

 Métodos

 `venderBotellas(int cantidad)`

Permite vender una determinada cantidad de botellas.

Antes de realizar la venta, se verifica que haya suficiente stock. Si hay botellas disponibles, se descuentan del stock.

`reponerStock(int cantidad)`

Permite agregar botellas al stock cuando se recibe una nueva cantidad de vino.


Al finalizar, se muestra por consola la cantidad de botellas que quedan en stock.
