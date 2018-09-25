package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		int x;
		int y;
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
				   x = 1;
				   break;
				}
				else
				{
					x = 0;
				}
			}
			if (x == 1)
			{
				break;
			}
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (a[i][j] == m)
					{
						x = 1;
						break;
					}
					else
					{
						x = 0;
					}
				}
				if (x == 1)
				{
					break;
				}
			}
		if (x == 0 || n > 4 || m > 4)
		{
			System.out.print("error\n");
		}
		else
		{

			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					b[i][j] = a[i][j];
				}
			}
			for (j = 0;j < 5;j++)
			{
				b[n][j] = a[m][j];
			}
			for (j = 0;j < 5;j++)
			{
				b[m][j] = a[n][j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",b[i][j]);
					if (j != 4)
					{
						System.out.print(' ');
					}
					else
					{
						System.out.print('\n');
					}
				}
			}
		}
		return 0;

	}

}

