package Util;

public class MultipleFiltro {
   private String entrada=""; //para validar 
   private String mensaje=""; //para validar
   private String extra=""; //para validar tamaño
   private int tipo;
   public MultipleFiltro(int tipo,String entrada,String mensaje,String extra){
       this.tipo=tipo;
       this.entrada=entrada;
       this.mensaje=mensaje;
       this.extra=extra;
       
   }
   public MultipleFiltro(int tipo,String entrada,String mensaje){
       this.tipo=tipo;
       this.entrada=entrada;
       this.mensaje=mensaje;
   }
    public String getEntrada() {
        return entrada;
    }
    
    public String getMensaje() {
        return mensaje;
    }
    
    public String getExtra() {
        return extra;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

}
