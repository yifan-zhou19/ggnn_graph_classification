package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[9][9];
		int r;
		int c;
		int e;
		int max;
		int mac;
		int minc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	for (i = 0;i < r;i++)
	{
			minc = i;
			max = -100;
			for (j = 0;j < c;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				   mac = j;
				}
				e = 1;
				for (k = 0;k < r;k++)
				{
					if (a[k][mac] < max)
					{
						e = 0;
						break;
					}
				}
			}
				if (e != 0)
				{
					System.out.printf("%d+%d",minc,mac);
				return 0;
				}

	}
			System.out.print("No\n");
				   return 0;
	}


}

