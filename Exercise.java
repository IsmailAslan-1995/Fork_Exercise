public class EXercise {

	public static void main(String[] args) {

		// char to string
		char c = 'a';
		String str = String.valueOf(c);

		// using Character class
		str = Character.toString(c);

		// another way
		str = new Character(c).toString();
		// string concatenation - worst performance
		str = "" + c;
		
		// char array to string
		char[] ca = { 'a', 'b', 'c' };
		str = String.valueOf(ca);
		// recommended way
		str = new String(ca);

	}

}
