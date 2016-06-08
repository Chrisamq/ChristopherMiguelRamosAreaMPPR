
package Entidad;


public class E_Especialidad {
    
private int IdEspecialidad;
private String Nombre;
  public E_Especialidad(int IdEspecialidad,String Nombre){
        this.IdEspecialidad=IdEspecialidad;
        this.Nombre=Nombre;
    }
    /**
     * @return the IdEspecialidad
     */
    public int getIdEspecialidad() {
        return IdEspecialidad;
    }

    /**
     * @param IdEspecialidad the IdEspecialidad to set
     */
    public void setIdEspecialidad(int IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String toString() {
        return Nombre;
    }
}
