package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int[][] a = new int[22][22];
		int j;
		int k;
		int l;
		int x;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= m + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				 a[i][j] = 0;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i][j] = x;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				 if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				 {
					 k = i - 1;
					 l = j - 1;
				 System.out.print(k);
				 System.out.print(" ");
				 System.out.print(l);
				 System.out.print("\n");
				 }
			}
		}
		return 0;
	}

}

