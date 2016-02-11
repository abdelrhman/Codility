
public class PermCheck {

	public static void main(String[] args) {
		 
		
	}
	public int solution(int[] a) {
        int expectedSum = (a.length * (a.length +1))/2 ;
        int sum = 0 ; 
        for (int i=0; i<a.length;i++){
        	sum+=a[i];
        }
        if(expectedSum == sum)
        	return 1;
		return 0;
    }

}
