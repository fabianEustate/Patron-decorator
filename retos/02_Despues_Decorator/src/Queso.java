public class Queso extends DecoradorPizza {
    public Queso(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + queso";
    }

    @Override
    public int precio() {
        return pizza.precio() + 3000;
    }
}
