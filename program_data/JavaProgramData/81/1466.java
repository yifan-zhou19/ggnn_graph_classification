package <missing>;

public class GlobalMembers
{
	public static int huanhang(int[][] sz, int x, int y)
	{
		int k;
		int t;
		int i;
		if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				t = sz[x][i];
				sz[x][i] = sz[y][i];
				sz[y][i] = t;
			}
			return 1;
		}
		if (x >= 5 || x < 0 || y >= 5 || y < 0)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] shuzu = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		int t;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		t = huanhang(shuzu, n, m);
		if (t == 0)
		{
			System.out.print("error");
		}
		if (t == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",shuzu[i][j]);
				}
				System.out.printf("%d\n",shuzu[i][4]);
			}
		}
		return 0;
	}


}

