package javaprograms;
public class Palindrom {
	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 ="";
		
		StringBuilder sb = new StringBuilder();
	
		sb.reverse();
		System.out.println("Reverse Value: "+ sb.reverse());
		
		for(int i=s1.length()-1; i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		System.out.println(s2);
		}
		
		if(s1.equals(s2)) {
			System.out.println("its palindrom");
		}else {
			System.out.println("it is not ");
		}

	}

}

