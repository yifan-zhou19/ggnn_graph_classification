package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int len;
		int[] ans = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = 1;
		ans[0] = 1; // ???
		while (n-- != 0)
		{
			t = 0; // ??
			for (i = 0;i < len;i++)
			{
				ans[i] = ans[i] * 2 + t; // ??+??
				t = ans[i] / 10; // ??
				ans[i] %= 10;
			}
			if (t > 0)
			{
				ans[len++] = t; // ????
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(ans[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

