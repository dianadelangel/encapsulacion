
package encapsulacion;

public class Encapsulacion {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        
        persona.setNombre("Diana");
        System.out.println(persona.getNombre());
        
        persona.setEdad(22);
        System.out.println(persona.getEdad());
        
        persona.setTelefono("56 1103 7536");
        System.out.println(persona.gettelefono());
        
        
        persona2.setNombre("Erika");
        System.out.println(persona2.getNombre());
        
        persona2.setEdad(36);
        System.out.println(persona2.getEdad());
        
        persona2.setTelefono("55 2919 5561");
        System.out.println(persona2.gettelefono());
    }
    
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public String gettelefono(){
        return this.telefono;
    }
}
