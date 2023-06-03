public class Ticket {
    private Long idTicket;
    private String nombreCajero;
    private Double cuenta;
    private int numProdcutos;

    public Ticket(Long idTicket, String nombreCajero, Double cuenta, int numProdcutos) {
        this.idTicket = idTicket;
        this.nombreCajero = nombreCajero;
        this.cuenta = cuenta;
        this.numProdcutos = numProdcutos;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    public Double getCuenta() {
        return cuenta;
    }

    public void setCuenta(Double cuenta) {
        this.cuenta = cuenta;
    }

    public int getNumProdcutos() {
        return numProdcutos;
    }

    public void setNumProdcutos(int numProdcutos) {
        this.numProdcutos = numProdcutos;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket=" + idTicket +
                ", nombreCajero='" + nombreCajero + '\'' +
                ", cuenta=" + cuenta +
                ", numProdcutos=" + numProdcutos +
                '}';
    }
}
