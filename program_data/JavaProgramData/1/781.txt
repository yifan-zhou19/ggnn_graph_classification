package <missing>;

public class GlobalMembers
{
	public static int tot;

	public static void find(int m,int n)
	{
		int i;
		int j;
		int k;
		if (m == 1)
		{
			tot = tot + 1;
		}
		else
		{
			for (i = n;i <= m;i++)
			{
			if (m % i == 0)
			{
			   find(m / i, i);
			}
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			tot = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			find(m, 2);
			System.out.print(tot);
			System.out.print("\n");
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

