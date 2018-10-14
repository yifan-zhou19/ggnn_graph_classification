package palindrome;
import java.util.Scanner;


public class palindrome {
public static void main(String[] args){
	System.out.print("Please give a word to check if it is palindrome: ");
	Scanner input=new Scanner(System.in);
	String word=input.nextLine();
	StringBuilder table=new StringBuilder(word);
	table.reverse();
	String word1=table.toString();
	if (word.equals(word1)){
		System.out.println("The word : "+word+" is palindrome");
		
	}else{
		System.out.println("The word : "+word+" is NOT palindrome");		
	}
	
	
	
}
}
