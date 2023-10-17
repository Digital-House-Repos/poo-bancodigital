import java.util.Date;

public class Debito {
    private int id;
    private String name;
    private Date month;
    private Date year;
    private double value;

    public Debito(int id, String name, Date month, Date year, double value) {
        this.id = id;
        this.name = name;
        this.month = month;
        this.year = year;
        this.value = value;
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

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
