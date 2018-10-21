package <missing>;

public class GlobalMembers
{
	public static int change(int a, int b, int t, int k)
	{
		if (t == k)
		{
			return (a + b);
		}
		else
		{
			change(b, a + b, t, k + 1);
		}
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 1 || m == 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(change(1, 1, m - 2, 1));
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

