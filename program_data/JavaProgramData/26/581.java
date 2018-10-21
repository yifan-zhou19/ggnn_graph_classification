import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i = 0;
		int k = 0;
		for (i = 0;i < 100;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
		}
		str1 = new Scanner(System.in).nextLine();
		k = str1.length();
		System.out.print(str1.charAt(0));
		for (i = 1;i < k;i++)
		{
			if ((str1.charAt(i - 1) != ' ') || (str1.charAt(i) != ' '))
			{
				System.out.print(str1.charAt(i));
			}
		}
		return 0;
	}

}

