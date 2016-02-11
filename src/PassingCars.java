
public class PassingCars {
	
	public static void main(String[] args) {
		int p[] = {0,1};//,0,1,1};
		System.out.println(solution(p));
	}

	 public static int solution(int[] a) {
	        // write your code in Java SE 8
		 int counter = 0; 
		 int pair = 0 ; 
		 int head = a[0];
		 for (int i=0 ; i< a.length; i++){
			 if (a[i] == head){
				 counter++; 
				 
			 }else{
				 
				 pair += counter;
				 if(pair > 1000000000)
					 return -1;
			 }
		 }
		 return pair; 
	    }
}
