package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int l;
		int min;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			for (j = n;j > 1;j--)
			{
				for (k = 0;k < j;k++)
				{
					min = a[k][0];
					for (l = 0;l < j;l++)
					{
						if (min > a[k][l])
						{
							min = a[k][l];
						}
					}
					for (l = 0;l < j;l++)
					{
						a[k][l] = a[k][l] - min;
					}
				}
				for (k = 0;k < j;k++)
				{
					min = a[0][k];
					for (l = 0;l < j;l++)
					{
						if (min > a[l][k])
						{
							min = a[l][k];
						}
					}
					for (l = 0;l < j;l++)
					{
						a[l][k] = a[l][k] - min;
					}
				}
				sum = sum + a[1][1];
				for (k = 1;k < j - 1;k++)
				{
					a[k][0] = a[k + 1][0];
					a[0][k] = a[0][k + 1];
				}
				for (k = 1;k < j - 1;k++)
				{
					for (l = 1;l < j - 1;l++)
					{
						a[k][l] = a[k + 1][l + 1];
					}
				}
			}
			System.out.print(sum);
			System.out.print('\n');
		}
		return 0;
	}

}

