package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int n;
		int m;
		int sum = 0;
		int i;
		int j;
		int k;
		int[][] a = new int[101][101];
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= l;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			for (j = 1;j <= m;j++)
			{
				for (k = 1;k <= n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m != 1 && n != 1)
			{
			for (k = 1;k <= n;k++)
			{
					sum += a[1][k];
			}
			for (k = 1;k <= n;k++)
			{
					sum += a[m][k];
			}
			for (k = 2;k < m;k++)
			{
					sum += a[k][1];
			}
			for (k = 2;k < m;k++)
			{
					sum += a[k][n];
			}
			System.out.print(sum);
			System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= m;j++)
				{
					for (k = 1;k <= n;k++)
					{
						sum += a[j][k];
					}
				}
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}



}

