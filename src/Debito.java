import java.util.Date;

public class Debito {
    private int id;
    private String cliente;
    private Date vencimiento;
    private double saldo;

    // Constructor
    public Debito(int id, String cliente, Date vencimiento) {
        this.id = id;
        this.cliente = cliente;
        this.vencimiento = vencimiento;
        this.saldo = 0;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Methods
    public void retirar(double monto) {
        this.saldo -= monto;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }
}
