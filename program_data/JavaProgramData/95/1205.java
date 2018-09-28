import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str1 = new String(new char[80]);
	public static String str2 = new String(new char[80]);
	public static int Main()
	{
		int i;
		int len1;
		int len2;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		for (i = 0; i < len1; i++)
		{
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				 str1.charAt(i) += 32;
			}
		}
		for (i = 0; i < len2; i++)
		{
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
			{
				str2.charAt(i) += 32;
			}
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print('>');
		}
		else if (strcmp(str1,str2) < 0)
		{
			System.out.print('<');
		}
		else
		{
			System.out.print('=');
		}
		return 0;
	}

}
