public class PizzaConQuesoYJamon extends Pizza {
    @Override
    public String getDescripcion() {
        return "Pizza basica + queso + jamon";
    }

    @Override
    public int precio() {
        return 18000;
    }
}
