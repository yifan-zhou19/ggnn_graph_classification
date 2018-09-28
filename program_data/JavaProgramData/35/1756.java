package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int r;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int max = 0;
		int min = 0;
		int m;
		int a = -1;
		int b = -1;
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (sz[i][max] < sz[i][j])
				{
					max = j;
				}
			}
			for (m = 0;m < r;m++)
			{
					if (sz[min][max] > sz[m][max])
					{
						min = m;
					}
			}
				if (min == i)
				{
					a = min;
					b = max;
				}
		}
		if (a == -1)
		{
			 System.out.print("No\n");
		}
		else if (a != -1)
		{
			System.out.printf("%d+%d\n",a,b);
		}
		return 0;
	}


}

