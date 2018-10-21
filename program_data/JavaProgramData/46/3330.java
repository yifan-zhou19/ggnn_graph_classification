package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int i;
		int k;
		int a;
		int e;
		int x;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (k = 0;k < row;k++)
		{
			for (i = 0;i < col;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[k][i] = Integer.parseInt(tempVar3);
				}
			}
		}
		k = 0;
		i = -1;
		e = 0;
		for (x = 0;;x = x + 2)
		{
			a = 0;
		   for (i = i + 1;i < col;i++)
		   {
			   System.out.printf("%d\n",sz[k][i]);
			   a++;
			   e++;
			   if (a == col - x)
			   {
				   break;
			   }
		   }
		   if (e == row * col)
		   {
			   break;
		   }
		   a = 0;
		   for (k = k + 1;k < row;k++)
		   {
			   System.out.printf("%d\n",sz[k][i]);
			   a++;
			   e++;
			   if (a == row - 1 - x)
			   {
				   break;
			   }
		   }
		   if (e == row * col)
		   {
			   break;
		   }
		   a = 0;
		   for (i = i - 1;i >= 0;i--)
		   {
			   System.out.printf("%d\n",sz[k][i]);
			   a++;
			   e++;
			   if (a == col - 1 - x)
			   {
				   break;
			   }
		   }
		   if (e == row * col)
		   {
			   break;
		   }
		   a = 0;
		   for (k = k - 1;k >= 0;k--)
		   {
				System.out.printf("%d\n",sz[k][i]);
				a++;
				e++;
				if (a == row - 2 - x)
				{
					break;
				}
		   }
		   if (e == row * col)
		   {
			   break;
		   }
		}
	return 0;
	}

}

