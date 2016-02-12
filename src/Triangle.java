import java.util.Arrays;

public class Triangle {
	
	public static void main(String[] args) {
		int a[] = {10,2,5,1,8,20};
		System.out.println(solution(a));
	}
	
	public static int solution(int[] a) {
        // write your code in Java SE 8
		Arrays.sort(a);
		for(int i = 0 ; i < a.length ; i++){
			int next = i+1; 
			int next2 = i+2 ;
			if(next2 >= a.length)
				break; 
			if(a[i] + a[next] <= a[next2])
				continue;
			if(a[next2] + a[next] <= a[i])
				continue;
			if(a[next2] + a[i] <= a[next])
				continue;
			return 1; 
		}
		return 0; 
    }

}
