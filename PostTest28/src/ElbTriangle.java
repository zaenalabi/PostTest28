public class ElbTriangle {
	public static void main(String[] args) {
		int intloop = 0;
		int c = 10;
		int b = 0;
		for (int a = 0; a < 6; a++) {
			intloop++;

			if (intloop <= 1) {
			} else {
				for (int i = b; i <= c; i++) {
					if (i % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print(i);
					}
				}
			}
			if (c == 5 && b == 5) {
			} else {
				c--;
				b++;
			}
			System.out.println("");
		}
	}

}
