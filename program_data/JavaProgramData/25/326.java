package <missing>;

public class GlobalMembers
{
	public static int[] ans = {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static void calc()
	{
		int i;
		int t = 0;
		for (i = 1;i <= 40;i++)
		{
			ans[i] = ans[i] * 2 + t;
			t = ans[i] / 10;
			ans[i] %= 10;
		}
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			calc();
		}
		j = 0;
		for (i = 40;i >= 1;i--)
		{
			if (ans[i] != 0)
			{
				j = 1;
			}
			if (j == 1)
			{
				System.out.print(ans[i]);
			}
		}
		return 0;
	}
}

