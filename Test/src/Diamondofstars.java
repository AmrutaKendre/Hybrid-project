
public class Diamondofstars {

	public static void main(String[] args) {
		for(int i = 1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k =1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
    // for lower half of the diamond pattern
		for(int i = 3;i>=1;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k =1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	

	}

}
