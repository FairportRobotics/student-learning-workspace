package edu.fairport.robotics.test;

public class FizzBuzz {

	public static Tuple isFizzBuzz(int i) {
		Tuple result = new Tuple();

		boolean isFizz = FizzBuzz.determineFB(i, 5, "Fizz");
		boolean isBuzz = FizzBuzz.determineFB(i, 7, "Buzz");

		result.setFizz(isFizz);
		result.setBuzz(isBuzz);

		return result;
	}

	public static boolean determineFB(int i, int number, String say) {
		boolean ran = false;
		boolean hasNumber = Integer.toString(i).contains("" + number);

		if (i % number == 0) {
			ran = true;
			System.err.print(say + "! ");
		}

		if (hasNumber) {
			ran = true;
			System.err.print(say + "! ");
		}
		return ran;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 99; i++) {
			Tuple t = FizzBuzz.isFizzBuzz(i);

			if (!t.isFizz() && !t.isBuzz()) {
				System.err.print(i);
			}
			
			System.err.println();
		}
	}
}
