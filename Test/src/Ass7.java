
public class Ass7 {

	public static void main(String[] args) {
		int rows = 7; // number of rows to print
		for (int i = 1; i <= rows; i++) {
			int num;
			if (i % 2 == 0) {
				num = 0;
				for (int j = 1; j <= rows; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;// ternary operator
				}
			} else {
				num = 1;
				for (int j = 1; j <= rows; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;
				}
			}
			System.out.println();
		}
	}
}