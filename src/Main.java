public class Main {
    public static void main(String[] args) {
     
        Persona persona=new Persona();
        persona.setNombre("Yandira");
        persona.setEdad(24);
        persona.setTelefono(973149586);
        System.out.println("Mi nombre es "+ persona.getNombre());
        System.out.println("mi edad es " + persona.getEdad()+" años");
        System.out.println("mi numero celular es:" + persona.getTelefono());
    }

}
class Persona{
    private int edad, telefono;
    private String nombre;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}