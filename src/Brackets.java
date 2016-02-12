import java.util.Stack;


public class Brackets {
	public static void main(String[] args) {
		String s = "{[()()]}" ;
		System.out.println(solution(s));
		
	}
	
	
	private static boolean isValid(String left, String right){
		if (left.equals("(") && right.equals(")"))
	        return true;
	    if (left.equals("{") && right.equals("}"))
	        return true ;
	    if (left.equals("[") && right.equals("]"))
	        return true; 
		return false; 
	}
	
	
	public static int solution(String s) {
		
		Stack<String> sStack = new Stack<>();
		for(char c : s.toCharArray()){
			//System.out.println(c);
			if (c == '{' ||c == '['||c == '('){
				sStack.add(String.valueOf(c));
				}
			else{
				if (sStack.isEmpty())
					return 0 ;
				String last = sStack.pop();
				if(!isValid(last, String.valueOf(c)))
					return 0 ; 
			}
		}
		if (!sStack.isEmpty())
			return 0 ; 
		
		return 1; 
    }
}
