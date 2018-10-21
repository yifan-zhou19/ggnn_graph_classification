package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int find = int n;
		int m;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 3;k <= (m / 2);k = k + 2)
		{
			if (k == find(k) && (m - k) == find(m - k))
			{
				System.out.print(k);
				System.out.print(" ");
				System.out.print(m - k);
				System.out.print("\n");
			}
		}
		return 0;
	}
	public static int find(int n)
	{
		int i;
		int c = 0;
		for (i = 1;i <= n;i++)
		{
			if (n % i == 0)
			{
				c = c + 1;
			}
		}
		if (c == 2)
		{
			return (n);
		}
		else
		{
			return 0;
		}
	}

}

