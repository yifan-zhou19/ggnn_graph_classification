package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[30][30];
		int[] x = new int[100];
		int[] y = new int[100];
		int count = 0;
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= m + 1;i++)
		{
			for (j = 2;j <= n + 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 2;i <= m + 1;i++)
		{
			for (j = 2;j <= n + 1;j++)
			{
				if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
				{
					count++;
					x[count] = i;
					y[count] = j;
				}
			}
		}
		for (i = 1;i <= count - 1;i++)
		{
			System.out.print(x[i] - 2);
			System.out.print(" ");
			System.out.print(y[i] - 2);
			System.out.print("\n");
		}
		System.out.print(x[count] - 2);
		System.out.print(" ");
		System.out.print(y[count] - 2);
		return 0;
	}

}

