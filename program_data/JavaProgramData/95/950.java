import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int flag = 0;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);

		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0; str1.charAt(i) != '\0'; i++)
		{
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		for (i = 0; str2.charAt(i) != '\0'; i++)
		{
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		flag = strcmp(str1, str2);
		if (flag == 0)
		{
			System.out.print('=');
			System.out.print("\n");
		}
		if (flag == 1)
		{
			System.out.print('>');
			System.out.print("\n");
		}
		if (flag == -1)
		{
			System.out.print('<');
			System.out.print("\n");
		}
		return 0;
	}



}

