package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int i;
		int j;
		int k;
		int n;
		int m;
		int swit1 = 0;
		int swit2 = 0;

			swit1 = 0;
			swit2 = 0;

			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						a[i][j] = Integer.parseInt(tempVar);
					}
				}
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (a[i][j] == n)
					{
						swit1 = 1;
					}
					if (a[i][j] == m)
					{
						swit2 = 1;
					}
				}
			}
	if (swit1 == 0 || swit2 == 0 || n >= 5 || m >= 5)
	{
				System.out.print("error");
	return 0;
	}
	else
	{
			if (swit1 == 1 && swit2 == 1)
			{
				for (i = 0;i < 5;i++)
				{
					b[i] = a[n][i];
				}
				for (i = 0;i < 5;i++)
				{
					a[n][i] = a[m][i];
				}
				for (i = 0;i < 5;i++)
				{
					a[m][i] = b[i];
				}
				for (i = 0;i < 5;i++)
				{
					for (j = 0;j < 5;j++)
					{
						if (j != 4)
						{
							System.out.printf("%d ", a[i][j]);
						}
						else if (j == 4)
						{
							System.out.printf("%d", a[i][j]);
						}
					}
					System.out.print("\n");
				}
			}
	}
	}
}

