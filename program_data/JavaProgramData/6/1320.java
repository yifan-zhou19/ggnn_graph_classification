package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int m;
	public static int n;
	public static int[][] a = new int[100][100];
	public static int i;
	public static int j;
	public static int sum = 0;
	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			k--;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= m;i++)
			{
			for (j = 1;j <= n;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			if (m == 1 || m == 2 || n == 1 || n == 2)
			{
				for (i = 1;i <= m;i++)
				{
					for (j = 1;j <= n;j++)
					{
					sum += a[i][j];
					}
				}
			}
			else
			{
				for (j = 1;j <= n;j++)
				{
				sum += a[1][j];
				}
				for (j = 1;j <= n;j++)
				{
				sum += a[m][j];
				}
				for (i = 2;i < m;i++)
				{
				sum += a[i][1];
				}
				for (i = 2;i < m;i++)
				{
				sum += a[i][n];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
	}

}

