import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[201]);
		String str2 = new String(new char[201]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		if (strcmp(str1,"0") == 0 && strcmp(str2,"0") == 0)
		{
			System.out.print(0);
		}
		else
		{

			int[] a = new int[200];
			int[] b = new int[200];
			int len1;
			int len2;
			int i;
			int j = 0;
			len1 = str1.length();
			len2 = str2.length();
			for (i = len1 - 1;i >= 0;i--)
			{
			 a[j++] = str1.charAt(i) - '0';
			}
			j = 0;
			for (i = len2 - 1;i >= 0;i--)
			{
				b[j++] = str2.charAt(i) - '0';
			}
			for (i = 0;i < 200;i++)
			{
				a[i] = a[i] + b[i];
				if (a[i] >= 10)
				{
					a[i] = a[i] - 10;
					 a[i + 1]++;
				}
			}
			for (i = 200 - 1;i >= 0;i--)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
				for (;i >= 0;i--)
				{
					System.out.print(a[i]);
				}
				System.out.print("\n");
				return 0;
		}
	}
}
