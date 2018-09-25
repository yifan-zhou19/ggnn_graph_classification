package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[5][5];
	int i;
	int j;
	int a;
	int x = 5;
	int y = 5;
	int m = 0;
	int n = 0;
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			(sz[i][j]) = Integer.parseInt(tempVar);
		}
		}


	}
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			for (a = 0;a < 5;a++)
			{
				if (a != j)
				{

					if (sz[i][j] > sz[i][a])
					{
					   m = m + 1;
					}


				}

				if (a != i)
				{

					if (sz[i][j] < sz[a][j])
					{
					n = n + 1;

					}


				}



			}

			if ((m == 4) && (n == 4))
			{
				x = i + 1;
				y = j + 1;
			}
			else
			{
				m = 0;
				n = 0;
			}

		}


	}

	if (x == 5)
	{
	System.out.print("not found");
	}
	else
	{
	System.out.printf("%d %d %d",x,y,sz[x - 1][y - 1]);
	}
	return 0;

	}

}

