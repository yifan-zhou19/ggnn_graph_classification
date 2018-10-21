package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int l;
		int S = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j <= m - 1;j++)
			{
				for (l = 0;l <= n - 1;l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 0 || j == m - 1 || l == 0 || l == n - 1)
					{
						S = S + a[j][l];
					}
				}
			}
			if (i < k)
			{
				System.out.print(S);
				System.out.print('\n');
			}
			else
			{
				System.out.print(S);
			}
			S = 0;
		}
	}
}

