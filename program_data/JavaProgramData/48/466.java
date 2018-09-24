package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; // b?????????
		int j;
		int k;
		int n;
		int m;
		int[][] a = new int[12][12];
		int[][] b = new int[12][12];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= 9;j++)
		{
				for (k = 1;k <= 9;k++)
				{
					b[j][k] = 0; //??b
				}
		}
		b[5][5] = m; //????
		for (i = 0;i < n;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					a[j][k] = b[j][k]; //a????b???
				}
			}
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++) //??????a???????????b?
				{
					b[j - 1][k - 1] += a[j][k];
					b[j - 1][k] += a[j][k];
					b[j - 1][k + 1] += a[j][k];
					b[j][k - 1] += a[j][k];
					b[j][k] += a[j][k];
					b[j][k + 1] += a[j][k];
					b[j + 1][k - 1] += a[j][k];
					b[j + 1][k] += a[j][k];
					b[j + 1][k + 1] += a[j][k];
				}
			}
		}
		for (j = 1;j <= 9;j++) //???????????
		{
			for (k = 1;k <= 9;k++)
			{
				System.out.print(b[j][k]);
				if (k != 9)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

