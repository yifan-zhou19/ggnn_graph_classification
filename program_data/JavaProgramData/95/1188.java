import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int len1;
		int len2;
		int i;
		int j;
		int n;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		n = 0;
		for (len1 = 0;str1.charAt(len1) != '\0';len1++)
		{
			;
		}
		for (len2 = 0;str1.charAt(len2) != '\0';len2++)
		{
			;
		}
		j = 'A'-'a';
		for (i = 0;i <= len1;i++)
		{
			if ((str1.charAt(i) != str2.charAt(i)) && ((str1.charAt(i) - str2.charAt(i)) != j) && ((str2.charAt(i) - str1.charAt(i)) != j))
			{
				if (str1.charAt(i) < str2.charAt(i))
				{
					if ((str1.charAt(i) - j) < str2.charAt(i))
					{
						System.out.print('<');
						break;
					}
					else
					{
						System.out.print('>');
						break;
					}
				}
				if (str1.charAt(i) > str2.charAt(i))
				{
					 if ((str1.charAt(i) + j) < str2.charAt(i))
					 {
						 System.out.print('<');
						 break;
					 }
					 else
					 {
						 System.out.print('>');
						 break;
					 }
				}
			}
			n++;
		}
		if (n == (len1 + 1))
		{
			System.out.print('=');
		}
	return 0;
	}
}
