# Patrón de diseño Decorator en Java

Repositorio académico para estudiar y demostrar el patrón de diseño estructural **Decorator**. Incluye material de exposición, una infografía, diagramas UML editables y dos aplicaciones Java que resuelven el reto del sistema de pizzas antes y después de aplicar el patrón.

## Contenido

- [`docs/diapositivas/`](docs/diapositivas/): presentación sobre el patrón Decorator.
- [`docs/infografia/`](docs/infografia/): infografía resumen del patrón.
- [`docs/diagramas/`](docs/diagramas/): diagramas de clases UML en formato Mermaid (`.mmd`), editables.
- [`retos/sistema-pizzas/antes-decorator/`](retos/sistema-pizzas/antes-decorator/): solución tradicional, con una clase por combinación.
- [`retos/sistema-pizzas/despues-decorator/`](retos/sistema-pizzas/despues-decorator/): solución que utiliza decoradores combinables.

## ¿Qué es Decorator?

Decorator es un patrón estructural que permite añadir responsabilidades a un objeto envolviéndolo con otros objetos, sin modificar la clase original. Resulta útil cuando las funcionalidades son opcionales y pueden combinarse.

## Reto: sistema de pizzas

Las dos aplicaciones implementan estos precios:

| Producto | Precio |
|---|---:|
| Pizza básica | $10.000 |
| Pizza básica + queso | $13.000 |
| Pizza básica + jamón | $15.000 |
| Pizza básica + jamón + queso | $18.000 |

### Antes de Decorator

Cada combinación se representa mediante una clase propia. Es sencillo de entender al principio, pero el número de clases aumenta cuando aparecen nuevas combinaciones.

### Después de Decorator

`PizzaBasica` representa el componente concreto. `DecoradorPizza` contiene una referencia a `Pizza`, y los decoradores `Queso` y `Jamon` añaden sus respectivos costos. La combinación se construye envolviendo objetos, por ejemplo:

```java
Pizza completa = new Queso(new Jamon(new PizzaBasica()));
```

## Requisitos

- JDK instalado (se recomienda Java 17 o posterior).
- Terminal o IDE como Visual Studio Code, IntelliJ IDEA o Eclipse.

## Ejecutar las aplicaciones

Cada solución es independiente y tiene su propio `Main.java`. Entra en la carpeta correspondiente y ejecuta:

```bash
javac src/*.java
java -cp src Main
```

Primero prueba `antes-decorator` y luego `despues-decorator` para comparar la estructura y los resultados.

## Diagramas Mermaid

Los archivos `.mmd` de `docs/diagramas/` se pueden editar en cualquier editor de texto compatible con Mermaid o en [Mermaid Live Editor](https://mermaid.live/).

## Objetivos de aprendizaje

- Identificar el problema de crear una clase por cada combinación.
- Reconocer los componentes del patrón Decorator.
- Implementar decoradores en Java mediante una interfaz compartida.
- Comparar dos diseños que producen los mismos resultados, pero difieren en extensibilidad.

## Referencias

- [Refactoring.Guru — Decorator](https://refactoring.guru/es/design-patterns/decorator)
- [Documentación Java — paquete java.io](https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html)

## Autoría y uso

Material preparado con fines académicos. Si reutilizas o adaptas los recursos, conserva las atribuciones correspondientes a sus autores originales.
