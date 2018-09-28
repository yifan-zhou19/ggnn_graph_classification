package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int k;
		int i;
		int j;
		int e;
		int[][] d = new int[10][100];
		int t;
		char[][] a = new char[10][100];
		char[][] b = new char[10][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = new Scanner(System.in).nextLine();
			scanf("\n");
		}
			for (i = 0;i < m;i++)
			{
				k = String.valueOf(a[i]).length();
				t = String.valueOf(b[i]).length();
				for (j = 0;j < 100;j++)
				{
					if (a[i][j] != '\0')
					{
						a[i][j] = a[i][j] - 48;
					}
					if (b[i][j] != '\0')
					{
						b[i][j] = b[i][j] - 48;
					}
				}
				for (j = k;j >= k - t;j--)
				{
					b[i][j] = b[i][j - k + t];
				}
				for (j = k - t - 1;j >= 0;j--)
				{
					b[i][j] = '\0';
				}
				e = 0;
				for (j = k - 1;j >= 0;j--)
				{
					if (a[i][j] - b[i][j] + e < 0)
					{
						d[i][j] = 10 + a[i][j] - b[i][j] + e;
						e = -1;
					}
					else
					{
						d[i][j] = a[i][j] - b[i][j] + e;
						e = 0;
					}
				}

				if (d[i][0] == 0)
				{
					for (j = 1;j < k;j++)
					{
						System.out.printf("%d",d[i][j]);
					}
				}
					else
					{
						for (j = 0;j < k;j++)
						{
							System.out.printf("%d",d[i][j]);
						}
					}
					System.out.print("\n");
			}
	}




}

