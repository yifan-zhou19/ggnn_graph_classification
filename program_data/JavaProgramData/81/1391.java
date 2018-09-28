package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int judge = new int(int array[][5],int x,int y);
		int[][] sz = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
						 for (j = 0;j < 5;j++)
						 {
										  String tempVar = ConsoleInput.scanfRead();
										  if (tempVar != null)
										  {
											  sz[i][j] = Integer.parseInt(tempVar);
										  }
						 }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (judge(sz, n, m) == 0)
		{
							 System.out.print("error\n");
		}
		else
		{
			 for (i = 0;i < 5;i++)
			 {
							  for (j = 0;j < 4;j++)
							  {
											   System.out.printf("%d ",sz[i][j]);
							  }
							  for (j = 4;j < 5;j++)
							  {
											   System.out.printf("%d",sz[i][j]);
							  }
							  System.out.print("\n");
			 }
		}

		return 0;
	}
	public static int judge(int[][] array, int x, int y)
	{
		int a;
		int[] t = new int[5];
		int i;
		a = (x >= 0 && x <= 4 && y >= 0 && y <= 4)?1:0;
		if (a == 1)
		{
				 for (i = 0;i < 5;i++)
				 {
								  t[i] = array[x][i];
								  array[x][i] = array[y][i];
								  array[y][i] = t[i];
				 }
		}
		return a;
	}
}

