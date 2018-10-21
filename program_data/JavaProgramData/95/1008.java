import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int str1len;
		int str2len;
		int i;
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str1len = str1.length();
		str2len = str2.length();
		for (i = 0;i <= str1len;i++)
		{
			if ((int)str1.charAt(i) >= 97)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, (int)str1.charAt(i) - 32);
			}
		}
		for (i = 0;i <= str2len;i++)
		{
				if ((int)str2.charAt(i) >= 97)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, (int)str2.charAt(i) - 32);
				}
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(str1,str2) == -1)
		{
			System.out.print("<");
		}
		if (strcmp(str1,str2) == 1)
		{
			System.out.print(">");
		}
		return 0;
	}
}

