package tp7;
//@author Nicolas
public class Tp7 {
    public static void main(String[] args) {
        Materia I = new Materia(111,"Ingles",1);
        Materia M = new Materia(222,"Matemáticas",1);
        Materia L = new Materia(333,"Laboratorio 1",1);
        Materia L1 = new Materia(333,"Laboratorio 1",1);
        
        Alumno a1= new Alumno(1001,"Lopez","Martin");
        Alumno a2= new Alumno(1002,"Martinez","Breda");
        
        a1.agregarMateria(M);
        a1.agregarMateria(I);
        a1.agregarMateria(L);
        System.out.println("**********************************************");
        System.out.println(" ");
        
        a2.agregarMateria(I);
        a2.agregarMateria(M);
        a2.agregarMateria(L);
        a2.agregarMateria(L);
        a2.agregarMateria(L1);
        a2.agregarMateria(new Materia(222,"Matemáticas",1));
        System.out.println("**********************************************");
        System.out.println(" ");
        
        
        
        System.out.print("El alumno "+a1.getNombre()+" "+a1.getApellido());
        System.out.println(" esta incripto en "+a1.cantidadMaterias()+" materias.");
        a1.mostrarMaterias();
        System.out.println(" ");
        
        
        System.out.print("El alumno "+a2.getNombre()+" "+a2.getApellido());
        System.out.println(" esta incripto en "+a2.cantidadMaterias()+" materias.");
        a2.mostrarMaterias();
        
        //los dos alumnos tienen la misma cantidad de materias porq las materias se guardaron
        //en un HashSet el cual guarda elementos desordenados y no permite ternerlos duplicados
        
        //tambien se sobreescribieron los metodos equals() y hashCode() para evitar las materias
        //repetidas q por los atributos se ven q son objetos iguales, pero los metodos mencionados antes de 
        //modificar los ven como objetos distintoss.
    }
}
