package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int r;
	   int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[r][c];
		for (int i = 0;i < r;i++)
		{
			for (int k = 0;k < c;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		int a;
		if (r > c)
		{
			a = c;
		}
		else
		{
			a = r;
		}
		int x = 0;
		for (int i = 0;i < a / 2;i++)
		{
			for (int m = x;m < c - x;m++)
			{
				System.out.printf("%d\n",sz[x][m]);
			}
								 for (int m = x + 1;m < r - x;m++)
								 {
									 System.out.printf("%d\n",sz[m][c - 1 - x]);
								 }
								 for (int m = c - 2 - x;m > x;m--)
								 {
									 System.out.printf("%d\n",sz[r - 1 - x][m]);
								 }
								 for (int m = r - 1 - x;m > x;m--)
								 {
									 System.out.printf("%d\n",sz[m][x]);
								 }
								 x++;
		}
		   if (c >= r != 0 && r % 2 != 0)
		   {
			   for (int i = r / 2;i < c - r / 2;i++)
			   {
				   System.out.printf("%d\n",sz[r / 2][i]);
			   }
		   }
								if (r > c && c % 2 != 0)
								{
									for (int i = c / 2;i < r - c / 2;i++)
									{
										System.out.printf("%d\n",sz[i][c / 2]);
									}
								}


			 return 0;
	}


}

