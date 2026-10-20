# Aplicación 1: antes de Decorator

## Problema
Cada combinación de ingredientes tiene una clase propia. Los precios se codifican por separado:
- Pizza básica: $10.000
- Pizza con queso: $13.000
- Pizza con jamón: $15.000
- Pizza con queso y jamón: $18.000

## Ejecutar
Desde esta carpeta, con Java JDK instalado:

```bash
javac src/*.java
java -cp src Main
```

## Limitación
Para añadir una combinación nueva, por ejemplo queso + jamón + aceitunas, habría que crear otra clase. También se repite lógica entre clases.
