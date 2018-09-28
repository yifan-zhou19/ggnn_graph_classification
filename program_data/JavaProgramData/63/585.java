package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int[][] b = new int[1000][1000];
		int[][] c = new int[1000][1000];
		int xo;
		int yo;
		int xt;
		int yt;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xo = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			yo = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < xo;i++)
		{
				for (int j = 0;j < yo;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i][j] = Integer.parseInt(tempVar3);
					}
				}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			xt = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			yt = Integer.parseInt(tempVar5);
		}
		for (int r = 0;r < xt;r++)
		{
				for (int t = 0;t < yt;t++)
				{
					String tempVar6 = ConsoleInput.scanfRead();
					if (tempVar6 != null)
					{
						b[r][t] = Integer.parseInt(tempVar6);
					}
				}
		}
		for (int k = 0;k < xo;k++)
		{
				 for (int l = 0;l < yt;l++)
				 {
						 for (int h = 0;h < yo;h++)
						 {
								 c[k][l] = c[k][l] + a[k][h] * b[h][l];
						 }
				 }
		}
		for (int q = 0;q < xo;q++)
		{
				for (int w = 0;w < yt - 1;w++)
				{
						System.out.printf("%d ",c[q][w]);
				}
				System.out.printf("%d\n",c[q][yt - 1]);
		}
	}
}

