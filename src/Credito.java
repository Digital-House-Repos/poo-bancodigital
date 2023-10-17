import java.util.Date;

public class Credito {
    private int id;
    private String cliente;
    private Date vencimiento;
    private double saldoLimite;
    private double saldoConsumido;
    private double saldoImpago;
    private double interes;
    private int maxCuotas;

    // Constructor
    public Credito(int id, String cliente, Date vencimiento, double saldoLimite, double interes, int maxCuotas) {
        this.id = id;
        this.cliente = cliente;
        this.vencimiento = vencimiento;
        this.saldoLimite = saldoLimite;
        this.saldoConsumido = 0;
        this.saldoImpago = 0;
        this.interes = interes;
        this.maxCuotas = maxCuotas;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public double getSaldoLimite() {
        return saldoLimite;
    }

    public void setSaldoLimite(double saldoLimite) {
        this.saldoLimite = saldoLimite;
    }

    public double getSaldoConsumido() {
        return saldoConsumido;
    }

    public void setSaldoConsumido(double saldoConsumido) {
        this.saldoConsumido = saldoConsumido;
    }

    public double getSaldoImpago() {
        return saldoImpago;
    }

    public void setSaldoImpago(double saldoImpago) {
        this.saldoImpago = saldoImpago;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getMaxCuotas() {
        return maxCuotas;
    }

    public void setMaxCuotas(int maxCuotas) {
        this.maxCuotas = maxCuotas;
    }

    // Methods
    public void retirar(double monto) {
        this.saldoConsumido += monto;
        this.saldoImpago += monto * this.interes;
    }

    public void comprar(double pago) {
        this.saldoConsumido += pago;
        this.saldoImpago += pago * this.interes;
    }

    public void resumen(double pago) {
        this.saldoConsumido -= pago;
        this.saldoImpago -= pago * this.interes;
    }
}
