package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[22][22];
	public static int m;
	public static int n;
	public static int panduan(int i,int j)
	{
		if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 22;i++)
		{
			for (j = 0;j < 22;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
				for (j = 1;j <= n;j++)
				{
				  if (panduan(i, j) != 0)
				  {
					  System.out.print(i - 1);
					  System.out.print(" ");
					  System.out.print(j - 1);
					  System.out.print("\n");
				  }
				}
		}
	   return 0;
	}
}

