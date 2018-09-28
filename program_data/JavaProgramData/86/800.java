package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //a[10][10]???????????????????????total???????????
		int[] b = new int[10];
		int[][] a = new int[10][10];
		int i;
		int j;
		int[] t = new int[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= b[i];j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		/*for(i=1;i<=n;i++)
			cout<<b[i];
			for(i=1;i<=n;i++)	
				for(j=1;j<=b[i];j++)
					cout<<a[i][j];
		return 0;
	}
	*/
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= b[i];j++)
			{
				if ((a[i][j - 1] + 3 * (j - 1) < 60) && (a[i][j] + 3 * j>60))
				{
					t[i] = 3 * j - 3;
				}
				if ((a[i][j] + 2 * j <= 60) && (a[i][j] + 3 * b[i]>60))
				{
					t[i] = 60 - a[i][j];
				}
			}
			if (a[i][b[i]] + 3 * b[i] < 60)
			{
				t[i] = 3 * b[i];
			}
			if ((a[i][b[i]] + 2 * b[i] <= 60) && (a[i][b[i]] + 3 * b[i]>60))
			{
				t[i] = 60 - a[i][b[i]];
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(60 - t[i]);
			System.out.print("\n");
		}
		return 0;
	}




}

