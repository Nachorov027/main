package Persona;

    public class Persona {
        private String nombre;
        private String apellidos;
        private int dnisinletra;
        private int edad;

        public Persona() { /* compiled code */ }
        public String getNombre() { return nombre; }
        public String getApellidos() { return apellidos; }
        public int getDnisinletra() { return dnisinletra;}
        public int getEdad() {return edad;}
        public void setNombre(String nom) { this.nombre =nom; }
        public void setApellidos(String apel) { this.apellidos =apel; }
        public void setDnisinletra(int dni) { this.dnisinletra =dni;}
        public void setEdad(int ed) {this.edad =ed;}
    }
