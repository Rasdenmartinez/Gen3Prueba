public class Sucursal {


    private String ubicacion;
    private Long numeroDeSucursal;
    private String nombreDeSucursal;

    public Sucursal(String ubicacion, Long numeroDeSucursal, String nombreDeSucursal) {
        this.ubicacion = ubicacion;
        this.numeroDeSucursal = numeroDeSucursal;
        this.nombreDeSucursal = nombreDeSucursal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Long getNumeroDeSucursal() {
        return numeroDeSucursal;
    }

    public void setNumeroDeSucursal(Long numeroDeSucursal) {
        this.numeroDeSucursal = numeroDeSucursal;
    }

    public String getNombreDeSucursal() {
        return nombreDeSucursal;
    }

    public void setNombreDeSucursal(String nombreDeSucursal) {
        this.nombreDeSucursal = nombreDeSucursal;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "ubicacion='" + ubicacion + '\'' +
                ", numeroDeSucursal=" + numeroDeSucursal +
                ", nombreDeSucursal='" + nombreDeSucursal + '\'' +
                '}';
    }
}






