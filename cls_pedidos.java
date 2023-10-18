public class cls_pedidos {
    private String str_cod_plato;
    private String str_cod_cliente;
    private String str_fecha;
    private float flt_total;
    private int int_cantidad;

    public cls_pedidos(String plato, String cliente, String fecha, float precio, int cantidad ){
        this.str_cod_plato = plato;
        this.str_cod_cliente = cliente;
        this.str_fecha = fecha;
        this.int_cantidad = cantidad;
        this.flt_total = precio * cantidad;
    }

    public String getPlato(){
        return this.str_cod_plato;
    }

    public String getCliente(){
        return this.str_cod_cliente;
    }
    public String getFecha(){
        return this.str_fecha;
    }
    public float getTotal(){
        return this.flt_total;
    }
    public int getCantidad(){
        return this.int_cantidad;
    }
}
