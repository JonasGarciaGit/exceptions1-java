
package model.exceptions;

//RunTimeException vc NÃO é obrigado a tratar
//Exception vc é obrigado a tratar

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public DomainException(String msg){
        super(msg);
    }
}
