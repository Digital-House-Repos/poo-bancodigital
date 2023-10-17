public class Credito {
    private int id;
    private String name;
    private double value;
    private double interes;
    private int cuotas;
    private double consumido;
    private double impago;

    public Credito(int id, String name, double value, double interes, int cuotas, double consumido, double impago) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.interes = interes;
        this.cuotas = cuotas;
        this.consumido = consumido;
        this.impago = impago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getConsumido() {
        return consumido;
    }

    public void setConsumido(double consumido) {
        this.consumido = consumido;
    }

    public double getImpago() {
        return impago;
    }

    public void setImpago(double impago) {
        this.impago = impago;
    }
}
