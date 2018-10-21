package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????????????           **
	//*????? 1100012873                **
	//*???2011.10.26                     **
	//****************************************
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int s;
		int t;
		int p;
		int q;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= k;t++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			s = 0;
			for (p = 0;p < m;p++)
			{
				for (q = 0;q < n;q++)
				{
					if (p == 0 || q == 0 || p == m - 1 || q == n - 1)
					{
						s = s + a[p][q];
					}
				}
			}
					System.out.print(s);
					System.out.print("\n");
		}
		return 0;
	}

}

