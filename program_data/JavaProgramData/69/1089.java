import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*1069 ?????*/ 



	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static int Main()
	{
		String x1 = new String(new char[260]);
		String x2 = new String(new char[260]);
		x1 = new Scanner(System.in).nextLine();
		x2 = new Scanner(System.in).nextLine();
		int len1; //len1.len2
		int len2;
		if (x1.length() < x2.length()) //len3.len4
		{
			String c = new String(new char[260]);
			c = x1;
			x1 = x2;
			x2 = c;
		}
		len1 = x1.length();
		len2 = x2.length();
		int i;
		int[] a1 = new int[260];
		int[] a2 = new int[260];
		//????????
		for (i = len1;i > 0;i--)
		{
			a1[i] = x1.charAt(i - 1) - '0';
			a2[i] = i - len1 + len2 >= 1?x2.charAt(i - len1 + len2 - 1) - '0':0;
		}
		//???????
		for (i = len1;i > 0;i--)
		{
		a1[i] += a2[i];
			int j = i;
			while (a1[j] >= 10 && j >= 0)
			{
				a1[j - 1] += a1[j] / 10;
				a1[j] %= 10;
				j--;
			}
		}
		   //??
		i = 0;
		while (a1[i] == 0 && i < len1)
		{
			i++;
		}
		for (;i <= len1;i++)
		{
			System.out.print(a1[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
