package tp7;
//@author Nicolas
import java.util.HashSet;
import java.util.Iterator;
public class Alumno{
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public  void agregarMateria(Materia m){
        if(materias.add(m)){
            System.out.println(m.getNombre()+" se ha agregado con exito");
            System.out.println("______________________________________________");
            return;
        }
        else{
            System.out.println(m.getNombre()+" no se ha podidio agregar");
            System.out.println("----------------------------------------------");
        }
    }
    public int cantidadMaterias(){
        return materias.size();
    }

    public void mostrarMaterias(){
        Iterator<Materia> it=materias.iterator();
        while(it.hasNext()){
            Materia materia= it.next();
            System.out.println(materia.getNombre());
        }
    }
    
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
