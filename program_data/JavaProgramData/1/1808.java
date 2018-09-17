package <missing>;

public class GlobalMembers
{
	public static int fuck(int n,int m)
	{
		int i;
		int cnt = 1;
		if (m >= Math.sqrt(n))
		{
			return 1;
		}
			for (i = m;i <= Math.sqrt(n);i++)
			{
				if (n % i == 0)
				{
					cnt += fuck(n / i, i);
				}

			}
			return cnt;

	}
	public static int Main()
	{
		int t;
		int n;
		int k;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= t;k++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fuck(n, 2));
			System.out.print("\n");
		}
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;

	}

}

