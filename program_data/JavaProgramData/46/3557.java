package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		int[][] sz = new int[100][100];
		int i;
		int j;
		int h;
		int l;
		int zs = 0;
		int ys;
		int yx;
		int n;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		ys = l - 1;
		yx = h - 1;
		n = h * l;
		for (i = 0;i < h;i++)
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
		while (k != -1)
		{
		for (i = zs,j = zs;j <= ys;j++)
		{
			   System.out.printf("%d\n",sz[i][j]);
			   k++;
			   if (k == n)
			   {
				   return 0;
			   }
		}
		for (j = ys,i = zs + 1;i <= yx;i++)
		{
			   System.out.printf("%d\n",sz[i][j]);
			   k++;
			   if (k == n)
			   {
				   return 0;
			   }
		}
		for (i = yx,j = ys - 1;j >= zs;j--)
		{
			   System.out.printf("%d\n",sz[i][j]);
			   k++;
			   if (k == n)
			   {
				   return 0;
			   }
		}
		for (i = yx - 1,j = zs;i > zs;i--)
		{
			   System.out.printf("%d\n",sz[i][j]);
			   k++;
			   if (k == n)
			   {
				   return 0;
			   }
		}
		zs++;
		ys--;
		yx--;
		if (k == n)
		{
			return 0;
		}
		}
	return 0;
	  }
}

