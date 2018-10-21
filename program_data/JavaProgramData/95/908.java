import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*??????????*/
	public static int Main()
	{
		String str1 = new String(new char[81]);
		String str2 = new String(new char[81]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine(); //???????
		int i;
		int a = str1.length();
		int b = str2.length(); //???????????
		for (i = 0;i < a;i++)
		{
			if (str1.charAt(i) <= 'Z' && str1.charAt(i) >= 'A')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, a, '\0');
		for (i = 0;i < b;i++) //?????????????????
		{
			if (str2.charAt(i) <= 'Z' && str2.charAt(i) >= 'A')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, b, '\0');
		if (strcmp(str1,str2) < 0) //????????????
		{
			System.out.print('<');
			System.out.print("\n");
		}
		else if (strcmp(str1,str2) > 0)
		{
			System.out.print('>');
			System.out.print("\n");
		}
		else
		{
			System.out.print('=');
			System.out.print("\n");
		}
		return 0;
	}
}

