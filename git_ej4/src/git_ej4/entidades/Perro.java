package git_ej4.entidades;

public class Perro {
    
    //atributos
    private String nombre;
    private String raza;
    private String sexo;
    private Integer edad;

    //constr vacio
    public Perro() {
    }

    //constr lleno
    public Perro(String nombre, String raza, String sexo, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
    }

    // getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    //to string
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    
    
}
