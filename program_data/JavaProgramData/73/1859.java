package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int p = 1;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (m = 0,j = 1;j < 5;j++)
			{
				if (a[i][m] < a[i][j])
				{
					m = j;
				}
			}
			for (n = 0,j = 1;j < 5;j++)
			{
				if (a[n][m] > a[j][m])
				{
					n = j;
				}
			}
			if (n == i)
			{
				System.out.print(n + 1);
				System.out.print(' ');
				System.out.print(m + 1);
				System.out.print(' ');
				System.out.print(a[n][m]);
			p = 0;
			}
		}
			if (p == 1)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
		return 0;
	}
}

