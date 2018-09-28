package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ans = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			if (i % 7 != 0 && (i % 10) != 7 && (i / 10) != 7)
			{
				ans += i * i;
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

