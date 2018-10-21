package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int[] rmb = {100, 50, 20, 10, 5, 1};
		int n;
		int i;
		int[] ans = new int[6];
		for (i = 0;i < 6;i++)
		{
			ans[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 6;i++)
		{
			while (n >= rmb[i])
			{
				ans[i]++;
				n = n - rmb[i];
			}
			System.out.print(ans[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

