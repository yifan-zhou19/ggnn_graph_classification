import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	/* ? ? ?   ???????? 
	/* ? ?      ????                           
	/* ? ? ? ??2010 ? 12  ?  15  ?     
	/* ? ? ? ?????????
	/* ? ?      ?1000012752        
	*******************************************************/ 
	public static int Main()
	{
		int length;
		int i;
		String s = new String(new char[102]); //s???????s1??????
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		length = s.length(); //????
		s = tangible.StringFunctions.changeCharacter(s, length, s.charAt(0)); //s??\0????????
		for (i = 0 ; i < length ; i++) //??0???length-1???s1?s??i????ASCII????????ASCII?
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, length, '\0'); //?s1???\0
		System.out.print(s1);
		return 0;
	}




}

