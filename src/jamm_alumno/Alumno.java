package jamm_alumno;

public class Alumno {
    //Atributos
    int numero_Control;
    String nombre;
    String apellido_Paterno;
    String apellido_Materno;
    char genero;
    String carrera;

    public Alumno(int numero_Control, String nombre, String apellido_Paterno, String apellido_Materno, char genero, String carrera) {
        this.numero_Control = numero_Control;
        this.nombre = nombre;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.genero = genero;
        this.carrera = carrera;
    }

    public int getNumero_Control() {
        return numero_Control;
    }

    public void setNumero_Control(int numero_Control) {
        this.numero_Control = numero_Control;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return String.format("Numero_Control: %-10s | Nombre: %-15s | Apellido_Paterno: %-10s | Apellido_Materno: %-10s | Genero: %-1s | Carrera: %-40s",
            numero_Control, nombre, apellido_Paterno, apellido_Materno, genero, carrera);
    }
}
