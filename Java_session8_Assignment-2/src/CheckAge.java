

//Define a method to check age and accordingly throw the exception
public class CheckAge {
	public void setAge(int age) throws NegativeAgeException {
		if (age < 0)
			throw new NegativeAgeException();
	}
}
