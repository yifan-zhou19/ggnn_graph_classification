package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int l;
		int k;
		k = 1;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				m = i;
				n = j;
				l = (a[m][n] >= a[m][0]) + (a[m][n] >= a[m][1]) + (a[m][n] >= a[m][2]) + (a[m][n] >= a[m][3]) + (a[m][n] >= a[m][4]);

				 l = l + (a[m][n] <= a[0][n]) + (a[m][n] <= a[1][n]) + (a[m][n] <= a[3][n]) + (a[m][n] <= a[4][n]) + (a[m][n] <= a[2][n]);

				if (l == 10)
				{
					System.out.print(m + 1);
					System.out.print(' ');
					System.out.print(n + 1);
					System.out.print(' ');
					System.out.print(a[m][n]);
					k = 0;
				}

			}


		}
		if (k == 1)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

