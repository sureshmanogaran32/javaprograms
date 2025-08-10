package javaprograms;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int start=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(start+" ");
				start++;
			}
			System.out.println();
		}

	}

}
