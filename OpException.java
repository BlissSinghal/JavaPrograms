package JavaWork;

public class OpException extends Exception{
	public OpException() {
		
	}
	public OpException(String msg) {
		super(msg);
	}
	public OpException(String msg, Throwable cause) {
		super(msg, cause);
	}
	public OpException(Throwable cause) {
		super(cause);
	}
	
}
