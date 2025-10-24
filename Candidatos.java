public class Candidatos {
    private String name; 
    private double result;

    public Candidatos(String name, double result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return getName() + " : " + getResult();
    }
}
