# Aplicación 2: después de Decorator

## Estructura
- `Pizza`: interfaz común.
- `PizzaBasica`: componente concreto con precio base de $10.000.
- `DecoradorPizza`: mantiene una referencia a otra `Pizza`.
- `Queso`: añade $3.000.
- `Jamon`: añade $5.000.

## Ejecutar
Desde esta carpeta, con Java JDK instalado:

```bash
javac src/*.java
java -cp src Main
```

## Combinación clave
```java
Pizza completa = new Queso(new Jamon(new PizzaBasica()));
```

El objeto se construye desde adentro hacia afuera: primero la pizza básica ($10.000), luego jamón (+$5.000) y finalmente queso (+$3.000). Total: $18.000.

## Ventaja
Para añadir un nuevo ingrediente, se crea otro decorador. No hace falta crear una clase para cada combinación existente.
