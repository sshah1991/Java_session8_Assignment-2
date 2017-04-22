
public class RunAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAge p1 = new CheckAge();
		int age = -30;

		System.out.println("Check age : " + age);
		//Check the age with the userdefined exception
		try {
			p1.setAge(age);
		} catch (NegativeAgeException e) {
			System.out.println("Exception :: "+e.getMessage());
		}
	}

}
