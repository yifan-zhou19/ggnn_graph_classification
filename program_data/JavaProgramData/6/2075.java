package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[100][99][99];
		int[] m = new int[100];
		int[] n = new int[100];
		int k;
		int i;
		int j;
		int l;
		int[] sum = new int[100];
		int leap;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= k - 1; i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j <= m[i] - 1; j++)
			{
				for (l = 0; l <= n[i] - 1; l++)
				{
					a[i][j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (i = 0; i <= k - 1; i++)
		{
			if (m[i] == 1 && n[i] == 1)
			{
				sum[i] = a[i][0][0];
			}
			else
			{
				for (j = 0; j <= m[i] - 1; j++)
				{
					sum[i] = a[i][j][0] + a[i][j][n[i] - 1] + sum[i];
				}
			}
		}
		for (i = 0; i <= k - 1; i++)
		{
			if (n[i] <= 2)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
			for (j = 1; j <= n[i] - 2; j++)
			{
				if (leap != 0)
				{
					break;
				}
				sum[i] = sum[i] + a[i][0][j] + a[i][m[i] - 1][j];
			}
		}
		for (i = 0; i <= k - 1; i++)
		{
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

