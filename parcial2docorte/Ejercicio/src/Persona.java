public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String documento;

    // Constructor
    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    

    //Métodos
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public String getDocumento() {
        return documento;
    }



    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public abstract String getRol();
    public abstract void mostrarDatosUnicos();

    public void mostrarInfo() {
        System.out.println(getRol());
        System.out.println("-------------------------------------------");
        System.out.println("El nombre de la persona es " + getNombre());
        System.out.println("La edad de la persona es " + getEdad());
        System.out.println("El documento de la persona es " + getDocumento());
        mostrarDatosUnicos();
        System.out.println("-------------------------------------------");
    }
}   
