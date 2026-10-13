public class Estudiante extends Persona{
        private String programa;
        private double promedio;


        //Constructoor
        public Estudiante(String nombre, int edad, String documento, String programa, double promedio) {
            super(nombre, edad, documento);
            this.programa = programa;
            this.promedio = promedio;
        }

        // Funciones
    
        public String getPrograma() {
            return programa;
        }

        public void setPrograma(String programa) {
            this.programa = programa;
        }

        public double getPromedio() {
            return promedio;
        }

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }


        @Override 
        public String getRol() {
            return "Estudiante";
        }

        @Override 
        public void mostrarDatosUnicos() {
            System.out.println("EL programa del estudiante es: " + getPrograma());
            System.out.println("El promedio del estudiante es " + getPromedio());
        }

        //Funciones
        
}
