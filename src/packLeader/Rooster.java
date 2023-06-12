package packLeader;

public class Rooster {
	static String s = "WIPRO LIMITED";
	
	private static void method1()  {
	String[] split = s.split(" ");
			for (int j = 0; j <s.length(); j++) {
				try {
				System.out.print(split[0].charAt(j));
				/*/
				 * This provides space after 5 chars
				 * if (j==2) {
					System.out.print(" ");
				       } 
				 */	
			} catch (Exception e) {
			}		
                try {
	            System.out.print(split[1].charAt(j));	
			} catch (Exception e) {
			}	
			}		
		}
		
	public static void main(String[] args)   {
	          Rooster.method1();	
		}
	}