public class Main {
    public static void main(String[] args) {
        Pizza basica = new PizzaBasica();
        Pizza conQueso = new Queso(new PizzaBasica());
        Pizza conJamon = new Jamon(new PizzaBasica());

        // El orden sigue el reto: primero jamon, luego queso.
        Pizza completa = new Queso(new Jamon(new PizzaBasica()));

        mostrar(basica);
        mostrar(conQueso);
        mostrar(conJamon);
        mostrar(completa);
    }

    private static void mostrar(Pizza pizza) {
        System.out.println("Pizza: " + pizza.getDescripcion());
        System.out.printf("Precio: $%,d%n", pizza.precio());
        System.out.println("------------------------------");
    }
}
