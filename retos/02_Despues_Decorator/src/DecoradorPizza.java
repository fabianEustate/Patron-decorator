public abstract class DecoradorPizza implements Pizza {
    protected final Pizza pizza;

    public DecoradorPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
