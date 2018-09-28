package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ans = new int[1000];
		int l = 0;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans[0] = 1;
		l = 1;
		while (n-- != 0)
		{
			for (i = 0; i < l; i++)
			{
				ans[i] = ans[i] << 1;
			}
			for (i = 0; i < l; i++)
			{
				if (i == l - 1 && ans[i] > 9)
				{
					l++;
				}
				ans[i + 1] += ans[i] / 10;
				ans[i] %= 10;
			}
		}
		for (i = l - 1; i >= 0; i--)
		{
			System.out.print(ans[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

