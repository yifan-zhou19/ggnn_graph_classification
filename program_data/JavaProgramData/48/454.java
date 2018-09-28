package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];
	public static int i;
	public static int j;
	public static void f(int day)
	{
		int k;
		int l;
		for (i = 1 ; i <= 9 ; i++)
		{
			for (j = 1 ; j <= 9 ; j++)
			{
				b[i][j] = a[i][j];
			}
		}
		if (day > 0)
		{
			for (i = 1 ; i <= 9 ; i++)
			{
				for (j = 1 ; j <= 9 ; j++)
				{
					if (a[i][j] != 0)
					{
						for (k = i - 1; k <= i + 1; k++)
						{
							for (l = j - 1; l <= j + 1; l++)
							{
								a[k][l] = a[k][l] + b[i][j];
							}
						}
					}
				}
			}
		f(day - 1);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		f(n);
		for (i = 1 ; i <= 9 ; i++)
		{
			for (j = 1 ; j <= 9 ; j++)
			{
				if (j == 9)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				else
				{
					System.out.printf("%d ",a[i][j]);
				}
			}
		}
		return 0;
	}
















}

