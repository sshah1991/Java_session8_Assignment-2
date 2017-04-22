

// Create an user defined Exception NegativeAgeException
public class NegativeAgeException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age cannot be less than zero";
	}

}
