package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] sz = new int[5][5];
		int a;
		int b;
		int t;
		int e = 0;
		int max;
		int min;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}

		for (i = 0;i < 5;i++)
		{
			 max = sz[i][0];
			for (j = 0;j < 5;j++)
			{
				if (sz[i][j] >= max)
				{
					max = sz[i][j];
					a = i;
					b = j;
				}
			}
			min = max;
			for (t = 0;t < 5;t++)
			{
				if (sz[t][b] <= min)
				{
					min = sz[t][b];
				}
			}
			if (max == min)
			{
				e = 1;
				break;
			}
		}
		if (e == 0)
		{
			System.out.print("not found");
		}
		else
		{
			System.out.printf("%d %d %d",a + 1,b + 1,max);
		}
		return 0;
	}


}

