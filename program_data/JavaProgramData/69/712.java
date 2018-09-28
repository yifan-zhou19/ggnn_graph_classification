package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		int[] p = new int[251];
		int[] q = new int[251];
		int[] ans = new int[251];
		int t;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int len1 = a.length();
		int len2 = b.length();
		int max = len1;
		if (len2 > len1)
		{
			max = len2;
		}
		for (int i = 0,j = len1 - 1;i < len1;i++,j--)
		{
			p[i] = a.charAt(j) - '0';
		}
		for (int i = 0,j = len2 - 1;i < len2;i++,j--)
		{
			q[i] = b.charAt(j) - '0';
		}
		for (int i = 0;i < max;i++)
		{
			ans[i] = p[i] + q[i];
		}
		for (int i = 0;i < max;i++)
		{
			if (ans[i] >= 10)
			{
				ans[i] = ans[i] - 10;
				ans[i + 1] = ans[i + 1] + 1;
			}
		}
		for (t = max;t >= 0;t--)
		{
			if (ans[t] != 0)
			{
				break;
			}
		}
		if (t == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (int i = t;i >= 0;i--)
			{
			System.out.print(ans[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}
