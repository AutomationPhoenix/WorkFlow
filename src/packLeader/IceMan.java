package packLeader;

public class IceMan {
	
	static int count=0;

	public static void main(String[] args) {

		String s = "I am a soldier";
		
		for (int i = 1; i < s.length(); i++) {
			
			if (s.charAt(i)==' ') {
				
				count++;
				
				
			} 
			
		}
		
		System.out.println("Total no. of words is: "+(count+1));
	}

}
