public class Jamon extends DecoradorPizza {
    public Jamon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + jamon";
    }

    @Override
    public int precio() {
        return pizza.precio() + 5000;
    }
}
