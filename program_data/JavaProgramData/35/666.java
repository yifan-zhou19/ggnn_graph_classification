package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int row;
		int col;
		int i;
		int j;
		int k;
		int max = 0;
		int f = 0;
		int g = 0;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
		   for (j = 0;j < col;j++)
		   {
			  if (max < sz[i][j])
			  {
				 max = sz[i][j];
				 m = i;
				 n = j;
			  }
		   }
			  for (k = 0;k < row;k++)
			  {
				 if (max > sz[k][n])
				 {
					 f = 1;
				 }
			  }
			  if (f == 0)
			  {
					  System.out.printf("%d+%d",m,n);
					  g = 1;
			  }
		}
		if (g == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

