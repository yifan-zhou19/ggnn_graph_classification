import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????:???????????
	//?????2011?11?1?
	//????????
	public static int Main() //?????
	{
	int i; //????
	String str1 = new String(new char[80]); //?????
	String str2 = new String(new char[80]);
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine(); //?????
	for (i = 0;str1.charAt(i) != '\0';i++)
	{
	  if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') //????1?????????
	  {
	   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
	  }
	  if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
	  {
				continue;
	  }
	}
		 for (i = 0;str2.charAt(i) != '\0';i++)
		 {
	  if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
	  {
		  str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32); //????2?????????
	  }

	  if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
	  {
				continue;
	  }
		 }
	if (strcmp(str1,str2) > 0)
	{
	System.out.print(">");
	System.out.print("\n");
	}
	if (strcmp(str1,str2) == 0)
	{
	System.out.print("=");
	System.out.print("\n");
	}
	if (strcmp(str1,str2) < 0)
	{
	System.out.print("<");
	System.out.print("\n");
	}
	return 0;
	}
}

