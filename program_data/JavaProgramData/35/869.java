package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int c;
		int b;
		int[][] a = new int[8][8];
		int[] e = new int[70];
		int x;
		int y;
		int k;
		int w = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < c;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < c;i++)
		{
			e[i] = 0;
			x = -1;
			y = -1;
			for (j = 0;j < b;j++)
			{
				if (a[i][j] > e[i])
				{
					e[i] = a[i][j];
					x = i;
					y = j;
					w = 1;
				}
			}
				for (k = 0;k < c;k++)
				{
					if (e[i] > a[k][y])
					{
						w = 0;
						break;
					}
				}
				if (w == 1)
				{
					System.out.printf("%d+%d\n",x,y);
					break;
				}


			if (w == 1)
			{
				break;
			}
		}
		if (w == 0)
		{
			System.out.print("No\n");
		}


	}
}

