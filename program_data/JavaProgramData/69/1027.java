import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str1 = "";
		final String str2 = "";
		int len1;
		int len2;
		int[] a = new int[250];
		int[] b = new int[250];
		int k = 0;
		int i = 0;
		int j = 0;
		int[] c = new int[251];
		int max;
		int flag = 0;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		if (len1 > len2)
		{
			max = len1;
		}
		else
		{
			max = len2;
		}
		for (i = len1 - 1;i >= 0;i--)
		{
			a[k++] = str1.charAt(i) - '0';
		}
		k = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			b[k++] = str2.charAt(i) - '0';
		}
		for (i = 0;i < max;i++)
		{
			c[i] = a[i] + b[i];
		}
		for (i = 0;i < 251;i++)
		{
			if (c[i] >= 10)
			{
				c[i] = c[i] % 10;
				c[i + 1]++;
			}
		}
		for (i = 250;i >= 0;i--)
		{
			if (c[i] > 0)
			{
				for (j = i;j >= 0;j--)
				{
					System.out.print(c[j]);
				}
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		return 0;
	}

}
