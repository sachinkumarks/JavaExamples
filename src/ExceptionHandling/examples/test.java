package ExceptionHandling.examples;

public class test {
	public static void voterIdEligiable(int age) throws exceptionHandling {
		if (age < 18) {
			throw new exceptionHandling("Sorry !!! you are not eligible for voting");
		} else {
			System.out.println("Welcome you are eligible for voting");
		}

	}

	public static void main(String[] args)  {
		try {
			voterIdEligiable(17);

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
