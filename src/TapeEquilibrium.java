
public class TapeEquilibrium {

	/**
	 * @author Abdelrhman
	 **/
	/*
	 * 
	 * A non-empty zero-indexed array A consisting of N integers is given. Array
	 * A represents numbers on a tape.
	 * 
	 * Any integer P, such that 0 < P < N, splits this tape into two non-empty
	 * parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
	 * 
	 * The difference between the two parts is the value of: |(A[0] + A[1] + ...
	 * + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
	 * 
	 * In other words, it is the absolute difference between the sum of the
	 * first part and the sum of the second part.
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static int solution(int[] a)  {
		int left, right = 0, total = 0, smallest = 0;
		if (a.length < 3 )
			try {
				throw new Exception() ;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		int p = 1 ; 
		left= a[0] ; 
		
		for (int i =1 ; i < a.length ; i++)
			right+=a[i];
		
		total = Math.abs(left - right); 
		smallest = total ; 
		
		for(p = 1 ; p <a.length -1 ; p++ ){
			left += a[p]; 
			right -=a[p];
			total = Math.abs(left - right);
			if(total < smallest)
				smallest = total;
		}
    	return smallest;
        
    }

}
