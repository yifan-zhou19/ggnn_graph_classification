package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
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
				int m;
				int f = 1;
				for (m = 0;m < 5;m++)
				{
					f = f * (a[i][j] >= a[i][m]);
				}
				if (f != 0)
				{
					int s;
					int t = 1;
					for (s = 0;s < 5;s++)
					{
						t = t * (a[i][j] <= a[s][j]);
					}
					if (t != 0)
					{
						System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
						return 0;
					}
				}
			}
		}
		System.out.print("not found");
		return 0;
	}
}

