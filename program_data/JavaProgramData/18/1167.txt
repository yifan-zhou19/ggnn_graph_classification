package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[][] a = new int[100][100];
		int max;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sum = 0;
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (l = n; l >= 2; l--)
			{
				for (j = 0; j < l; j++)
				{
					max = a[j][0];
					for (k = 0; k < l; k++)
					{
						if (max > a[j][k])
						{
							max = a[j][k];
						}
					}
					for (k = 0; k < l; k++)
					{
						a[j][k] = a[j][k] - max;
					}
				}
				for (j = 0; j < l; j++)
				{
					max = a[0][j];
					for (k = 0; k < l; k++)
					{
						if (max > a[k][j])
						{
							max = a[k][j];
						}
					}
					for (k = 0; k < l; k++)
					{
						a[k][j] = a[k][j] - max;
					}
				}
				sum = sum + a[1][1];
				for (j = 2; j < l; j++)
				{
					a[0][j - 1] = a[0][j];
				}
				for (j = 2; j < l; j++)
				{
					a[j - 1][0] = a[j][0];
				}
				for (j = 2; j < l; j++)
				{
					for (k = 2; k < l; k++)
					{
						a[j - 1][k - 1] = a[j][k];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

