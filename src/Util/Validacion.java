package Util;

import Entidad.E_Personal;
import java.util.ArrayList;

public class Validacion {
    //variables privadas
    private int metodSoloNumero = 1;
    private int metodSoloNumeroTamano = 2;
    private int metodSoloLetra = 3;
    private int metodSoloLetraTamano = 4;
    private int metodTamanoCadena = 5;
    
//    private ArrayList<MultipleFiltro> listMultipleValidacion;
//    
//    
//    public void setMultipleValidacion(ArrayList<MultipleFiltro> listaEntrada){//validacionMultiple
//        listMultipleValidacion=listaEntrada;
//    }
    public Validacion(){
        //setear por defecto al instanciar 
    }
    
    private boolean soloNumeros(String cadena){  //validar solo numeros
        boolean ver=true;
        char []vec=cadena.toCharArray();
        for(int i=0;i<vec.length;i++){
            if(!Character.isDigit(vec[i])){
                ver=false;
                break;
            }
        }
        return ver;
    }
     private boolean soloLetras(String cadena){  //validar solo letras
        boolean ver=true;
        char []vec=cadena.toCharArray();
        for(int i=0;i<vec.length;i++){
            if(!Character.isLetter(vec[i])){
                ver=false;
                break;
            }
        }
        return ver;
    }
    
    private boolean soloNumerosYTamano(String cadena,int size){  //validar solo numeros con un tamaño indicado
        return size==cadena.trim().length()&&soloNumeros(cadena)?true:false;
    }
    private boolean soloLetrasYTamano(String cadena,int size){  //validar solo letras con un tamaño indicado
        return size==cadena.trim().length()&&soloLetras(cadena)?true:false;
    }
    
    
    //metodos de muestra
    
    public String validarSoloNumero(String cadena,String mensaje){
        return soloNumeros(cadena)?"":mensaje;
    }
    
    public String validarSoloLetra(String cadena,String mensaje){
         return soloLetras(cadena)?"":mensaje; 
    }
    public String validarTamanoCadena(String cadena,String mensaje,int tamano){
         return cadena.length()==tamano?"":mensaje; 
    }
    public String validarSoloNumeroTamano(String cadena,String mensaje,int size){
         return soloNumerosYTamano(cadena,size)?"":mensaje; 
    }
    
    
    
    public String validarCamposMultiples(ArrayList<MultipleFiltro> listMultipleValidacion){
        String salida="";
        
        for (MultipleFiltro valor : listMultipleValidacion) {
            int aa=valor.getTipo();
            switch(valor.getTipo()){
                case 1: //solo numero
                      salida+=validarSoloNumero(valor.getEntrada(),valor.getMensaje())+"\n";
                    break;
                case 2: //solo numero con un tamano
                      salida+=validarSoloNumeroTamano(valor.getEntrada(),valor.getMensaje(),Integer.parseInt(valor.getExtra()))+"\n";
                    break;
                case 3: //solo letra
                      salida+=validarSoloLetra(valor.getEntrada(),valor.getMensaje())+"\n";
                    break;
                case 4: //solo letra con tamano
                    break;
                case 5: //cadenaTamano
                    salida+=validarTamanoCadena(valor.getEntrada(),valor.getMensaje(),Integer.parseInt(valor.getExtra()))+"\n";
                    break;
            }
        }

        return salida;
    }
           
            
    
    //validar solo numeros con un tamaño indicado
    //validar solo caracteres con un tamaño indicado
    
    //validar solo numeros y letras
    
    //Validar si es vacio true (si), false (no)
    
    
    
    
    //campo 1, campo 2, campo 3, campo 4
    
    // lista
    //

    /**
     * @return the vSoloNumero
     */
    public int metodSoloNumero() {
        return metodSoloNumero;
    }

    /**
     * @return the vSoloNumeroTamano
     */
    public int metodSoloNumeroTamano() {
        return metodSoloNumeroTamano;
    }

    /**
     * @return the vSoloLetra
     */
    public int metodSoloLetra() {
        return metodSoloLetra;
    }

    /**
     * @return the vSoloLetraTamano
     */
    public int metodSoloLetraTamano() {
        return metodSoloLetraTamano;
    }
    public int metodTamanoCadena() {
        return metodTamanoCadena;
    }
    
}
