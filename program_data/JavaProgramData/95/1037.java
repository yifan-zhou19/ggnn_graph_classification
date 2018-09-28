import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String str1 = new String(new char[81]); //???????82?????
		String str2 = new String(new char[82]);
		str1 = new Scanner(System.in).nextLine(); //??????????
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++) //????????????????
		{
			if ((int)str1.charAt(i) >= 65 && (int)str1.charAt(i) <= 90)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
			if ((int)str2.charAt(i) >= 65 && (int)str2.charAt(i) <= 90)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		if (strcmp(str1,str2) == 0) //?????????????
		{
			System.out.print('=');
		}
			else if (strcmp(str1,str2) < 0)
			{
				System.out.print('<');
			}
			else
			{
				System.out.print('>');
			}
			return 0;

	}
}

