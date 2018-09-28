package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int t;
		int i;
		int j;
		int[] g = new int[303];
		int count = 0;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = 0;
			t = 0;
			count = 0;
			for (i = 1;i <= n;i++)
			{
				g[i] = 0;
			}
			if (n == 0)
			{
				break;
			}
			while (count < n - 1)
			{
				k = k + 1;
				if (k == n + 1)
				{
					k = 1;
				}
				if (g[k] == 0 && t != m)
				{

					t = t + 1;
				}
				if (g[k] == 0 && t == m)
				{
					g[k] = 1;
					count = count + 1;
					t = 0;
				}
			}
			for (j = 1;j <= n;j++)
			{
				if (g[j] == 0)
				{
					System.out.print(j);
					System.out.print("\n");
				}
			}

		}
		return 0;
	}
}

