public class Main {

	public static void main(String[] args) {

		String inputString = "Hello World!";
		byte[] byteArray = inputString.getBytes();

		int[] hash = Sha256.pad(byteArray);
		System.out.println(hash);
	}
}
