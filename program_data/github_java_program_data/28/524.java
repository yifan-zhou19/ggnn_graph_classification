package tr.org.linux.kamp2016.helloworld;

public class Palindrome {

	public static void main(String args[]){
		
		String newString="ey edip adanada pide ye";
		System.out.println(isPalindrome(newString));
	}
	
	public static boolean isPalindrome(String str){
		boolean answer=false;
		
		String newString1="";
		
		for(int i=str.length()-1;i>=0;i--){
			newString1=newString1+str.charAt(i);
		}
		
		if(!newString1.equals(str)){		
			return answer;
		}
		
		else {
			answer=true;
			return answer;
		}	
}
}