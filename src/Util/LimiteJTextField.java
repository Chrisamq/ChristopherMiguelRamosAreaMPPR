
package Util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimiteJTextField extends PlainDocument{
    
    private int limite;
    public LimiteJTextField(int i){
        super();
        this.limite=i;
    }
    public void insertString(int compensacion,String str,AttributeSet attr)throws BadLocationException{
        if(str==null)return;
        if((getLength()+str.length()<=limite)){
            super.insertString(compensacion, str, attr);
        }     
    }
}
