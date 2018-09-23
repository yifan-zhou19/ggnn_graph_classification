import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l = 0;
		int k = 0;
		int[] m = new int[100];
		int str1;
		int str2;
		int str3;
		String a = new String(new char[1000]);
		String b = new String(new char[100]);
		String c = new String(new char[1000]);
		String d = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		str1 = a.length();
		str2 = b.length();
		str3 = c.length();
		for (i = 0;i < str1;i++)
		{
			for (j = 0;j < str2;j++)
			{
				if (a.charAt(i + j) != b.charAt(j))
				{
					break;
				}
				if (j == str2 - 1 && (a.charAt(i - 1) == ' ' || i == 0))
				{
					m[k] = i;
					k++;
				}
			}
		}
		k = 0;
		for (i = 0;i < str1;i++)
		{
			if (m[k] == i)
			{
				l++;
				k++;
				i += str2 - 1;
				for (j = 0;j < str3;j++)
				{
					System.out.print(c.charAt(j));
				}
			}
			else
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}
}
