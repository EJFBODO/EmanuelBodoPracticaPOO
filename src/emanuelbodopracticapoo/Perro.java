
package emanuelbodopracticapoo;

/**
 *
 * @author Emanuel
 */
public class Perro {
   private String nombre,raza;
   private int edad;
    
    public Perro(){
        this.edad=0;
        this.nombre="";
        this.raza="";
        System.out.println ("Nuevo Perro...");    }
            
    
    public Perro(String nombre){
            this ();
            this.nombre=nombre;
        }
    
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return edad;
    }
    
    public void setNombre(String nombre){if (!nombre.equals("")) this.nombre=nombre;}
    public String getNombre(){return nombre;}
    
    public void setRaza(String raza){if (!raza.equals("")) this.raza=raza;}
    public String getRaza(){return raza;}
    
    public void ladrar(){System.out.println ("Guau");}
   
    public void printing(){System.out.println (nombre);}

}
