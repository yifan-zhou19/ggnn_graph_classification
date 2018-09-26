import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 String a = new String(new char[80]);
	 String b = new String(new char[80]);
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 for (i = 0;a.charAt(i) != '\0';i++) //??????????
	 {
	  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
	  {
	   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
	  }
	  if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
	  {
				continue;
	  }
	 }
		 for (i = 0;b.charAt(i) != '\0';i++) //??????????
		 {
	  if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
	  {
		  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
	  }
	  if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
	  {
				continue;
	  }
		 }
		if (strcmp(a,b) < 0)
		{
		  System.out.print("<");
		}
	 if (strcmp(a,b) > 0)
	 {
		  System.out.print(">");
	 }
	 if (strcmp(a,b) == 0)
	 {
		  System.out.print("=");
	 }
	 return 0;
	}

}

