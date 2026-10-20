public class Main {
    public static void main(String[] args) {
        mostrar(new PizzaBasica());
        mostrar(new PizzaConQueso());
        mostrar(new PizzaConJamon());
        mostrar(new PizzaConQuesoYJamon());
    }

    private static void mostrar(Pizza pizza) {
        System.out.println("Pizza: " + pizza.getDescripcion());
        System.out.printf("Precio: $%,d%n", pizza.precio());
        System.out.println("------------------------------");
    }
}
