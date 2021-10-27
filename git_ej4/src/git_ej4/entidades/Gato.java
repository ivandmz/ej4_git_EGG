package git_ej4.entidades;

public class Gato {
    
    //atributos
    private String nombre;
    private String color;
    private Integer edad;
    private Boolean castrado;
    private String sexo;

    //constr vacio o predeterminado
    public Gato() {
    }

    //constr. lleno o parametrizado
    public Gato(String nombre, String color, Integer edad, Boolean castrado, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.castrado = castrado;
        this.sexo = sexo;
    }

    // getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    //To String
    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", castrado=" + castrado + ", sexo=" + sexo + '}';
    }
    
    
    
    
}
