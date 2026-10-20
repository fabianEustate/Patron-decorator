public class PizzaBasica implements Pizza {
    @Override
    public String getDescripcion() {
        return "Pizza basica";
    }

    @Override
    public int precio() {
        return 10000;
    }
}
