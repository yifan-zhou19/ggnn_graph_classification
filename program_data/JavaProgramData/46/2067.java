package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] sz = new int[100][100];
		int x;
		int y;
		int z;
		int a;
		int b;
		int w = 0;
		int i;
		int[][] bz = new int[100][100];
		int flag = 0;
		//bz????????flag=0?????=1?????=2?????=3????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int p = 0;p <= m + 1;p++)
		{
			for (int q = 0;q <= n + 1;q++)
			{
				bz[q][p] = 1; //???�?�
			}
		}
		for (int p = 1;p <= m;p++)
		{
			for (int q = 1;q <= n;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[q][p] = Integer.parseInt(tempVar3);
				}
				bz[q][p] = 0;
			}
		}
		x = 1;
		y = 1;
		while (w < m * n)
		{
			System.out.printf("%d\n",sz[x][y]);
			bz[x][y] = 1;
			w++;
			switch (flag)
			{
			case 0:
				if (bz[x + 1][y] == 1)
				{
					flag = 1; //???
					y++;
				}
				else
				{
					x++;
				}
				break;
			case 1:
				if (bz[x][y + 1] == 1)
				{
					flag = 2; //???
					x--;
				}
				else
				{
					y++;
				}
				break;
			case 2:
				if (bz[x - 1][y] == 1)
				{
					flag = 3; //???
					y--;
				}
				else
				{
					x--;
				}
				break;
			case 3:
				if (bz[x][y - 1] == 1)
				{
					flag = 0; //???
					x++;
				}
				else
				{
					y--;
				}
				break;
			}
		}
		return 0;
	}


}

