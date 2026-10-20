public class PizzaConQueso extends Pizza {
    @Override
    public String getDescripcion() {
        return "Pizza basica + queso";
    }

    @Override
    public int precio() {
        return 13000;
    }
}
