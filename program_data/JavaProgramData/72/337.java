package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[] x = new int[100];
		int[] y = new int[100];
		int p = 0;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j <= n + 1;j++)
		{
			a[0][j] = a[1][j];
		}
		for (j = 0;j <= n + 1;j++)
		{
			a[m + 1][j] = a[m][j];
		}
		for (i = 0;i <= m + 1;i++)
		{
			a[i][0] = a[i][1];
		}
		for (i = 0;i <= m + 1;i++)
		{
			a[i][n + 1] = a[i][n];
		}
		/*for(i=0;i<=m+1;i++)
		{
			for(j=0;j<=n+1;j++)
			{
				cout<<a[i][j]<<" ";
			}
			cout<<endl;
		}*/
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
				{
					x[p] = i;
					y[p] = j;
					p++;
				}
			}
		}
		for (j = 0;j <= p - 2;j++)
		{
			for (i = 0;i <= p - 2 - j;i++)
			{
				if (x[i] > x[i + 1] || x[i] == x[i + 1] && y[i] > y[i + 1])
				{
					k = x[i];
					x[i] = x[i + 1];
					x[i + 1] = k;
					k = y[i];
					y[i] = y[i + 1];
					y[i + 1] = k;

				}
			}
		}
		for (i = 0;i <= p - 1;i++)
		{
			System.out.print(x[i] - 1);
			System.out.print(" ");
			System.out.print(y[i] - 1);
			System.out.print("\n");
		}

		return 0;
	}




}

