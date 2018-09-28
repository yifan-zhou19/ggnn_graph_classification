package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int x;
		int y;
		int X;
		int Y;
		int i;
		int k;
		int tx;
		int ty;
		tx = 1;
		ty = 1;
		char dou;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar2 != null)
		{
			dou = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			X = Integer.parseInt(tempVar3);
		}
		for (y = 0;y <= Y - 1;y++)
		{
			for (x = 0;x <= X - 1;x++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[x][y] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (y = 0;y <= Y - 1;y++)
		{
			for (x = 0;x <= X - 1;x++)
			{
				for (i = 0;i <= X - 1;i++)
				{
					tx = 1;
					if (sz[i][y] > sz[x][y])
					{
						tx = 0;
						break;
					}
				}
				for (k = 0;k <= Y - 1;k++)
				{
					ty = 1;
					if (sz[x][k] < sz[x][y])
					{
						ty = 0;
						break;

					}
				}
				if (tx == 1 && ty == 1)
				{
					System.out.printf("%d+%d\n",y,x);
				break;
				}
			}
		   if (tx == 1 && ty == 1)
		   {
			   break;
		   }
		}
		if (tx == 0 || ty == 0)
		{
			System.out.print("No\n");
		}
	 return 0;
	}

}

