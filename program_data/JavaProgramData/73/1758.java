package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[5][5];
		int b = 0;
		int c = 0;
		int d = 0;
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
				b = 0;
				c = 0;
				for (k = 0;k < 5;k++)
				{
					if (a[i][j] > a[i][k])
					{
						b++;
					}
					if (a[i][j] < a[k][j])
					{
						c++;
					}
				}
				if (b == 4 && c == 4)
				{
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					d++;
				}
			}
		}
		if (d == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

