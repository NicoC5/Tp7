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
        System.out.println("agregando "+m.getNombre());
        Iterator<Materia> it=materias.iterator();
        while(it.hasNext()){
            Materia materia= it.next();
            if( materia.equals(m) ){
                System.out.println(materia.getNombre()+" ya se a agregado anteriormente");
                System.out.println("----------------------------------------------");
                return;
            }
        }
        materias.add(m);
        System.out.println("______________________________________________");
    }
    public int cantidadMaterias(){
        int i=0;
        //forma 1
        //for(Materia it:materias)
        //    i++;
        //forma 2
        Iterator it=materias.iterator();
        /*for(;it.hasNext();it.next())
            i++;
        */
        //forma 3
        while(it.hasNext()){
            it.next();
            i++;
        }
        return i;
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
