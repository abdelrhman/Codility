

public class PermMissingElem {
	
	
	public static void main(String[] args) {
		int a []  = {2,3,4,5};
		System.out.println(solution(a));
	}
	public static int solution(int[] A) {
        // write your code in Java SE 8
		int N = A.length + 1;
        int total = N * (N + 1) / 2;

        for (int i : A) {

            total -= i;
        }

        return total; 
    }

}
