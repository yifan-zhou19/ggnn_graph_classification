import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[81]);
		String str2 = new String(new char[81]);
		int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < str1.length();i++)
		{
		   if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
		   {
			   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
		   }
		}
		for (i = 0;i < str2.length();i++)
		{
			if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) == 1)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) == -1)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		return 0;
	}


}

