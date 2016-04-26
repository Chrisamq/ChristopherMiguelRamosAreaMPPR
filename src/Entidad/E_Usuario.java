
package Entidad;


public class E_Usuario {
    

    private String usuario;
    private String contrasena;
    private int idusuario;
    
    public E_Usuario(String usuario,String contrasena,int  idusuario){
       this.usuario=usuario;
       this.contrasena=contrasena;
       this.idusuario=idusuario;  
    }
    
    public  E_Usuario() { }
  
  
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
}





