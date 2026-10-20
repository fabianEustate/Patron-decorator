public class PizzaConJamon extends Pizza {
    @Override
    public String getDescripcion() {
        return "Pizza basica + jamon";
    }

    @Override
    public int precio() {
        return 15000;
    }
}
