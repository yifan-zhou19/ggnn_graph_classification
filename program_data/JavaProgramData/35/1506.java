package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int a;
		int b;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int y = 0;
		int n = 0;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b - 1;j++)
			{
				if (sz[i][y] < sz[i][j + 1])
				{
					y = j + 1;
				}
			}
			for (int k = 0;k < a;k++)
			{
				if (sz[i][y] < sz[k][y])
				{
					n++;
				}
			}
			if (n == a - 1)
			{
				break;
			}
		}
		if (n == a - 1)
		{
			System.out.printf("%d+%d",i,y);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}


}

