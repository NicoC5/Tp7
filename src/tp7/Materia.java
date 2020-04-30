package tp7;
//@author Nicolas
public class Materia {
    private int idMateria;
    private String nombre;
    private int año;
    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o!=null || o instanceof Materia){
            Materia otra=(Materia)o;
            if(nombre==otra.getNombre())
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return idMateria;
    }
    
    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
}
