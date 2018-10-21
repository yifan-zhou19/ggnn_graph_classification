package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][1000];
		int i;
		int j;
		int n;
		int flag = 0;
		int row1;
		int row2;
		int col1;
		int col2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sz[i][j] = Integer.parseInt(tempVar2);
			   }
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					 row1 = i;
					 col1 = j;
					 flag = 1;
					 break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		flag = 0;
	   for (i = n - 1;i >= 0;i--)
	   {
			for (j = n - 1;j >= 0;j--)
			{
				if (sz[i][j] == 0)
				{
					 row2 = i;
					 col2 = j;
					 flag = 1;
					 break;
				}
			}
			if (flag == 1)
			{
				break;
			}
	   }
	   System.out.printf("%d",(row2 - row1 - 1) * (col2 - col1 - 1));

	   return 0;
	}
}

