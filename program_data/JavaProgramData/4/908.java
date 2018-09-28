package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] zz = new int[100][100];
		int k;
		int t;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0 ; i < m ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				zz[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			k = 0;
			t = i;
			for (j = 0 ; ; j++)
			{
				if (t >= 0 && k < m)
				{
					System.out.print(zz[k++][t--]);
					System.out.print("\n");
				}
				if (t < 0 || k >= m)
				{
					break;
				}
			}
		}
		for (i = 1 ; i < m ; i++)
		{
			k = i;
			t = n - 1;
			for (j = 0 ; ; j++)
			{
				if (t >= 0 && k < m)
				{
					System.out.print(zz[k++][t--]);
					System.out.print("\n");
				}
				if (t < 0 || k >= m)
				{
					break;
				}
			}
		}
	}

}

