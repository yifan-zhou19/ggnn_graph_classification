import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int l1;
		int l2;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		l1 = str1.length();
		l2 = str2.length();
		for (i = 0;i < l1;i++)
		{
			if (str1.charAt(i) <= 'Z')
			{
				str1.charAt(i) += 32;
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (str2.charAt(i) <= 'Z')
			{
				str2.charAt(i) += 32;
			}
		}
		t = strcmp(str1,str2);
		if (t == 0)
		{
			System.out.print("=");
			System.out.print('\n');
		}
		else if (t < 0)
		{
			System.out.print("<");
			System.out.print('\n');
		}
		else
		{
			System.out.print(">");
			System.out.print('\n');
		}
		return 0;
	}



}
