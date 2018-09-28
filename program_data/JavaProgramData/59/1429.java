package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] map = new int[101][101];
	public static void cover(int x,int y)
	{
		 if (x > 1 && map[x - 1][y] == 0)
		 {
			 map[x - 1][y] = 2;
		 }
		 if (y > 1 && map[x][y - 1] == 0)
		 {
			 map[x][y - 1] = 2;
		 }
		 if (x < n && map[x + 1][y] == 0)
		 {
			 map[x + 1][y] = 2;
		 }
		 if (y < n && map[x][y + 1] == 0)
		 {
			 map[x][y + 1] = 2;
		 }
	}
	public static int Main()
	{
	   int m;
	   int i;
	   int j;
	   int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char c;
		for (i = 1;i <= n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 c = tempVar2.charAt(0);
			 }
			 for (j = 1;j <= n;j++)
			 {
				   String tempVar3 = ConsoleInput.scanfRead(null, 1);
				   if (tempVar3 != null)
				   {
					   c = tempVar3.charAt(0);
				   }
				if (c == '.')
				{
					map[i][j] = 0;
				}
				else if (c == '#')
				{
					map[i][j] = -1;
				}
				else if (c == '@')
				{
					map[i][j] = 1;
				}
			 }
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		m--;
		while (m-- != 0)
		{
		   for (i = 1;i <= n;i++)
		   {
			 for (j = 1;j <= n;j++)
			 {
				if (map[i][j] == 1)
				{
				 cover(i, j);
				}
			 }
		   }
		  for (i = 1;i <= n;i++)
		  {
			 for (j = 1;j <= n;j++)
			 {
				if (map[i][j] >= 1)
				{
				 map[i][j] = 1;
				}
			 }
		  }

		}
		s = 0;
		for (i = 1;i <= n;i++)
		{
		 for (j = 1;j <= n;j++)
		 {
			if (map[i][j] == 1)
			{
				s++;
			}
		 }
		}
	   System.out.printf("%d\n",s);
		return 0;
	}

}

