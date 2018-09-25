import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[1000]);
	   a = new Scanner(System.in).nextLine();
	   int c = a.length();

	   String b = new String(new char[1000]);
	   for (int i = 0;i <= c - 2;i++)
	   {
		 b = tangible.StringFunctions.changeCharacter(b, i, (char)((int)(a.charAt(i)) + (int)(a.charAt(i + 1))));
	   }
	   b = tangible.StringFunctions.changeCharacter(b, c - 1, (char)((int)(a.charAt(c - 1)) + (int)(a.charAt(0))));
	   for (int i = 0;i < c;i++)
	   {
		 System.out.print(b.charAt(i));
	   }


	 return 0;
	}

}

