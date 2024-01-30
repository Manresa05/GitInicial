public class Usuario{
    public String nombre;
    public String apellidos;
    public String email;

    public Usuario(String nombre, String apellidos, String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNombre (){
        return this.nombre;
    }

    public String getApellidos (){
        return this.apellidos;
    }

    public String getEmail (){
        return this.email;
    }
}
