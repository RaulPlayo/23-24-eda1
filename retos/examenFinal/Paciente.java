import java.time.LocalDate;

public class Paciente implements DatosLista {
    private String nombre;
    private LocalDate fecha;
    
    public Paciente(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    @Override
    public String getInfo() {
       return "fecha y nombre del paciente: " + this.fecha.toString() + " " + this.nombre;
    }
    
}
