import java.util.HashMap;


public class Brackets {
	public static void main(String[] args) {
		String s = "{[()()]}" ;
		System.out.println(solution(s));
		
	}
	
	
	
	public static int solution(String s) {
		
		if (s.length() % 2 != 0)
			return 0;
		
		HashMap<String, String> nestingChars = new HashMap<>();
		nestingChars.put("{", "}");
		nestingChars.put("[", "]");
		nestingChars.put("(", ")");
		nestingChars.put("}", "{");
		nestingChars.put("]", "[");
		nestingChars.put(")", "(");
		char [] sToChars = s.toCharArray();
		for (int i =0 ; i< s.length()/2 ; i++){
			int backIndex = s.length() -1 -i;
			System.out.println(nestingChars.get(sToChars[i]+"").equals(sToChars[backIndex]+""));
			if (!nestingChars.get(sToChars[i]+"").equals(sToChars[backIndex]+""))
				return 0;
		}
		
		return 1; 
    }
}
