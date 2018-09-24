package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int n;
		int j;
		int k;
		int min;
		int sum;
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		n = p;
		for (int i = 0; i < p; i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			do
			{

					for (j = 0; j < n; j++)
					{
						min = a[j][0];
						for (k = 1; k < n; k++)
						{
						if (min > a[j][k])
						{
							min = a[j][k];
						}
						}
					for (k = 0; k < n; k++)
					{
						a[j][k] -= min;
					}
					}
					for (j = 0; j < n; j++)
					{
						min = a[0][j];
						for (k = 1; k < n; k++)
						{
							if (min > a[k][j])
							{
							min = a[k][j];
							}
						}
					for (k = 0; k < n; k++)
					{
						a[k][j] -= min;
					}
					}
				sum += a[1][1];
				for (j = 0; j < n; j++)
				{
					for (k = 1; k < n; k++)
					{
						a[j][k] = a[j][k + 1];
					}
				}
				for (j = 1; j < n; j++)
				{
					for (k = 0; k < n; k++)
					{
						a[j][k] = a[j + 1][k];
					}
				}
				n--;
			}while (n > 1);
			System.out.print(sum);
			System.out.print("\n");
			n = p;
		}
	return 0;
	}

}

