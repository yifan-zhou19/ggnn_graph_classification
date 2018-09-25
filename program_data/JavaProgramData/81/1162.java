package <missing>;

public class GlobalMembers
{
	public static int change(int x, int y)
	{
		if (x < row && y < col)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{

		int i;
		int j;
		int n;
		int m;
		int[][] a = new int[row][col];
		int t;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		t = change(n, m);
		if (t == 0)
		{
			System.out.print("error");
		}
		else
		{
			int[][] b = new int[5][5];
			for (i = 0;i < col;i++)
			{
				b[0][i] = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = b[0][i];
			}
			for (i = 0;i < row;i++)
			{
				if (i == 0)
				{
						for (j = 0;j < col;j++)
						{
							if (j == 0)
							{
								System.out.printf("%d",a[i][j]);
							}
							else
							{
								System.out.printf(" %d",a[i][j]);
							}
						}
				}
				 else
				 {
						System.out.print("\n");
						for (j = 0;j < col;j++)
						{
							if (j == 0)
							{
								System.out.printf("%d",a[i][j]);
							}
							else
							{
								System.out.printf(" %d",a[i][j]);
							}
						}

				 }


			}
		}


		return 0;

	}

}

