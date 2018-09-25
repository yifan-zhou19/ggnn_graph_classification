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
		int t;
		int a1;
		int a2 = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (m = 0;m < 5;m++)
		{
			for (n = 0;n < 5;n++)
			{
				for (t = 0;t < 5;t++)
				{
					if (a[m][n] < a[m][t])
					{
					break;
					}
				}
				if (t != 5)
				{
				continue;
				}
				if ((t == 5) && (a[m][n] <= a[0][n]) && (a[m][n] <= a[1][n]) && (a[m][n] <= a[2][n]) && (a[m][n] <= a[3][n]) && (a[m][n] <= a[4][n]))
				{
					System.out.print(m + 1);
					System.out.print(" ");
					System.out.print(n + 1);
					System.out.print(" ");
					System.out.print(a[m][n]);
					System.out.print("\n");
					a2 = 1;
				}
			}
		}
		if (a2 == 0)
		{
		System.out.print("not found");
		System.out.print("\n");
		}
		return 0;
	}

}

