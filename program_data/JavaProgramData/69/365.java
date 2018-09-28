import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ?????
	// ????wayne
	// ?????12.30



	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] a1 = new int[250];
		int[] b1 = new int[250];
		int[] c = new int[260];
		int i;
		int j = 0;
		int max;
		for (i = 0;i < 250;i++)
		{
			a1[i] = 0;
			b1[i] = 0;
			c[i] = 0;
		}
		for (i = 250;i < 260;i++)
		{
			c[i] = 0;
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		if (a.length() >= b.length())
		{
			max = a.length();
		}
		else
		{
			max = b.length();
		}
		for (i = a.length() - 1,j = 0;i >= 0;i--,j++)
		{
			a1[j] = a.charAt(i) - '0';
		}
		for (i = b.length() - 1,j = 0;i >= 0;i--,j++)
		{
			b1[j] = b.charAt(i) - '0';
		}
		for (i = 0;i < max;i++)
		{
			c[i] += a1[i] + b1[i];
			if (c[i] >= 10)
			{
				c[i + 1]++;
				c[i] -= 10;
			}
		}
		while (c[i] == 0 && i > 0)
		{
			i--;
		}
		for (;i >= 0;i--)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");



		return 0;
	}


}
