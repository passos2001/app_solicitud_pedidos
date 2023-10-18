public class cls_clientes {
    private String str_nombre;
    private String str_codigo;
    private String str_direccion;
    private String str_contacto;

    public cls_clientes(String nombre, String codigo, String direccion, String contacto) {
        this.str_nombre = nombre;
        this.str_codigo = codigo;
        this.str_direccion = direccion;
        this.str_contacto = contacto;
    }

    // Setters
    public void setNombre(String nombre) {
        this.str_nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.str_direccion = direccion;
    }

    public void setContacto(String contacto) {
        this.str_contacto = contacto;
    }

    //Getters
    public String getNombre(){
        return str_nombre;
    }

    public String getCodigo(){
        return str_codigo;
    }
    
    public String getDireccion(){
        return str_direccion;
    }

    public String getContacto(){
        return str_contacto;
    }
}
