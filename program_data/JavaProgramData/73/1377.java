package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int js = 0;
		int m = 0;
		int k;
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
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				js = 0;
				for (k = 0;k <= 4;k++)
				{
					if (a[i][j] >= a[i][k])
					{
						js++;
					}
				}
				if (js == 5)
				{
					js = 0;
					for (k = 0;k <= 4;k++)
					{
						if (a[i][j] <= a[k][j])
						{
							js++;
						}
					}
					if (js == 5)
					{
						System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
						m = 1;
					}
				}
			}
		}
		if (m == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}

}

