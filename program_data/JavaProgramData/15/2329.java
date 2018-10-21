package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[101][101];
		int p;
		int q;
		int l;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] == 0)
				{
					p = i;
					q = j;
				}
			}
		}
		for (i = 1 ; i <= p ; i++)
		{
			for (j = 1 ; j <= q ; j++)
			{
				if (a[i][j] == 0)
				{
					l = i;
					m = j;
					i = p;
					break;
				}
			}
		}
		j = (p - l - 1) * (q - m - 1);
		System.out.print(j);
		return 0;
	}

}

