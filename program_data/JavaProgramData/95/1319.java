import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sgn = 0;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;str1.charAt(i) != '\0' && str2.charAt(i) != '\0';i++) //????????
		{
			if (str1.charAt(i) < str2.charAt(i))
			{
				if (str1.charAt(i) >= 97 || str2.charAt(i) < 97)
				{
					System.out.print('<');
					sgn = 1;
					break;
				}
				else if (str1.charAt(i) + 32 > str2.charAt(i))
				{
					System.out.print('>');
					sgn = 1;
					break;
				}
				else if (str1.charAt(i) + 32 < str2.charAt(i))
				{
					System.out.print('<');
					sgn = 1;
					break;
				}
			}
			if (str1.charAt(i) > str2.charAt(i))
			{
				if (str2.charAt(i) >= 97 || str1.charAt(i) < 97)
				{
					System.out.print('>');
					sgn = 1;
					break;
				}
				else if (str2.charAt(i) + 32 > str1.charAt(i))
				{
					System.out.print('<');
					sgn = 1;
					break;
				}
				else if (str2.charAt(i) + 32 < str1.charAt(i))
				{
					System.out.print('>');
					sgn = 1;
					break;
				}
			}
		}
		if (sgn == 0) //?????????
		{
			System.out.print('=');
		}
		return 0;
	}
}
