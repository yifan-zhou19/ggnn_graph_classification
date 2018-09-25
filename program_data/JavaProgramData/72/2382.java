package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] map = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
	   for (i = 1;i <= n;i++)
	   {
		for (j = 1;j <= m;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  map[i][j] = Integer.parseInt(tempVar3);
		  }
		}
	   }
	   for (i = 1;i <= n;i++)
	   {
		   map[i][0] = map[i][m + 1] = 0;
	   }
	   for (i = 1;i <= m;i++)
	   {
		   map[0][i] = map[n + 1][i] = 0;
	   }
	   int f = 0;
	   for (i = 1;i <= n;i++)
	   {
		for (j = 1;j <= m;j++)
		{
		  if (map[i][j] >= map[i - 1][j] != 0 && map[i][j] >= map[i][j - 1] != 0 && map[i][j] >= map[i + 1][j] != 0 && map[i][j] >= map[i][j + 1])
		  {
						  if (f != 0)
						  {
							  System.out.print("\n");
						  }
						  System.out.printf("%d %d",i - 1,j - 1);
						  f = 1;
		  }
		}
	   }
		   return 0;
	}

}

