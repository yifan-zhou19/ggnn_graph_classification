import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int k;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine(); //????2????
		for (k = 0;k < 80;k++) //?????????????
		{
			if ('Z' >= str1.charAt(k) && str1.charAt(k) >= 'A')
			{
				str1.charAt(k) += 32;
			}
			else
			{
				continue;
			}
		}
		for (k = 0;k < 80;k++)
		{
			if ('Z' >= str2.charAt(k) && str2.charAt(k) >= 'A')
			{
				str2.charAt(k) += 32;
			}
			else
			{
				continue;
			}
		}
		a = strcmp(str1,str2); //??2??????????a
		if (a == 0)
		{
			System.out.print("=");
		}
		else if (a == 1)
		{
			System.out.print(">");
		}
		else if (a == -1)
		{
			System.out.print("<");
		}
		return 0;

	}
}
