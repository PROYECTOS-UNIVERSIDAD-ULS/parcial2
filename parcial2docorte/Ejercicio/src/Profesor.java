public class Profesor extends Persona {
    private String area;
    private double salarioBase;
    private int horasCatedra;

    
    public Profesor(String nombre, int edad, String documento, String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }


    public double calcularSalario(){
        double salarioTotal = (getHorasCatedra() * 8333) + salarioBase;
        return salarioTotal;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasCatedra() {
        return horasCatedra;
    }

    public void setHorasCatedra(int horasCatedra) {
        this.horasCatedra = horasCatedra;
    }
    
    @Override 
    public String getRol(){
        return "Profesor";
    }

    @Override 
    public void mostrarDatosUnicos() {
        System.out.println("El area del docente es " + getArea());
        System.out.println("El salario base del docente es " + getSalarioBase());
        System.out.println("Las horas de catedra del docente son " + getHorasCatedra());
    }
}
