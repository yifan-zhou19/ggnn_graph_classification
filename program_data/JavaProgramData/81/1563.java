package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);
		int i;
		int j;
		int x;
		int y;
		int[][] d = new int[5][5];
		int[] b = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d[i][j] = Integer.parseInt(tempVar);
		}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		if (f(x, y) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
			b[j] = d[x][j];
			  d[x][j] = d[y][j];
			  d[y][j] = b[j];
			}
			  for (i = 0;i < 5;i++)
			  {
				 System.out.print("\n");
				 for (j = 0;j < 4;j++)
				 {
					 System.out.printf("%d ",d[i][j]);
				 }
				 System.out.printf("%d",d[i][4]);
			  }
		}
	}
		public static int f(int m,int n)
		{
			int c;
			if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
			{
				c = 1;
			}
			else
			{
				c = 0;
			}
			return (c);
		}


}

