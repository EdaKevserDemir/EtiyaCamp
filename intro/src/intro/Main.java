package intro;

public class Main {

	public static void main(String[] args) {

		for (int i = 2; i <= 1000; i++) {
			boolean check = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = true;
					break;
				}
			}

			if (check == false) {
				System.out.println(i);

			}

		}

	}

}
