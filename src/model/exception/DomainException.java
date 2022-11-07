package model.exception;

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;


    //Permite que mensagem fique armazenada dentro da Exceção.
    public DomainException(String msg) {
        super(msg);
    }
}
