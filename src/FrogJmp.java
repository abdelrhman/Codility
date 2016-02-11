
public class FrogJmp {

	public static void main(String[] args) {
		System.out.println(solution(1000000, 850000000, 300000));
	}
	
	 public static int solution(int X, int Y, int D) {
	        // write your code in Java SE 8
		 return (int) Math.ceil((double)(Y-X)/D) ; 
	    }
}
