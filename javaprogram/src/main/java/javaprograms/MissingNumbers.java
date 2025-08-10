package javaprograms;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,3,5};
		int b=15;
		int c=0;
		
		
		
		for(int i=0;i<=a.length-1; i++) {
			//System.out.println(a[i]);
			c=c+a[i];	
		}
		System.out.println(c);
		int e = b-c;
		System.out.println("Missing Number : "+ e);
	}

}
