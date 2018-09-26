package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int row;
		int col;
		int r = 0;
		int q;
		int w;
		int i;
		int n;
		int[] max = new int[8];
		int[] min = new int[8];
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
		 for (n = 0;n < col;n++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[i][n] = Integer.parseInt(tempVar3);
		   }
		   max[i] = sz[i][0];
		   min[n] = sz[0][n];
		 }
		}
		for (i = 0;i < row;i++)
		{
		 for (n = 0;n < col;n++)
		 {
		 if (sz[i][n] > max[i])
		 {
			 max[i] = sz[i][n];
		 }
		 if (sz[i][n] < min[n])
		 {
			 min[n] = sz[i][n];
		 }
		 }
		}
		for (i = 0;i < row;i++)
		{
		 for (n = 0;n < col;n++)
		 {
		 if (max[i] == min[n])
		 {
			 r = 1;
			 q = i;
			 w = n;
		 }
		 }
		}
		if (r == 1)
		{
		System.out.printf("%d+%d",q,w);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

