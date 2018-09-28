package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int r;
		int c = 0;
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
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				r = 0;
				for (k = 0;k < 5;k++)
				{
					if (a[i][k] > a[i][j])
					{
						r = 1;
					}
				}
				if (r == 0)
				{
					for (k = 0;k < 5;k++)
					{
						if (a[k][j] < a[i][j])
						{
							r = 1;
						}
					}
				}
				if (r == 0)
				{
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					c = 1;
					break;
				}
			}
			if (r == 0)
			{
				break;
			}
		}
		if (c == 0)
		{
			System.out.print("not found");
		}
	}
}

