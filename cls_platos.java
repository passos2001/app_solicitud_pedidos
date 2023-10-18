public class cls_platos {
    private String str_codigo;
    private String str_nombre;
    private float flt_precio;

    public cls_platos(String codigo, String nombre, float precio) {
        this.str_codigo = codigo;
        this.str_nombre = nombre;
        this.flt_precio = precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.str_nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.str_nombre = precio;
    }

    // Getters
    public String getCodigo(){
        return str_codigo;
    }

    public String getNombre(){
        return str_nombre;
    }
    
    public float getPrecio(){
        return flt_precio;
    }

}