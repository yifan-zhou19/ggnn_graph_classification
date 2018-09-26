package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int i = 0;
		int k = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g;
		int j;
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x1;i++)
		{
			for (k = 0;k < y1;k++)
			{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][k] = Integer.parseInt(tempVar3);
		  }
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (j = 0;j < x2;j++)
		{
			for (l = 0;l < y2;l++)
			{
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  b[j][l] = Integer.parseInt(tempVar6);
		  }
			}
		}
		for (d = 0;d < x1;d++)
		{
			for (e = 0;e < y2;e++)
			{
				 for (f = 0;f < x2;f++)
				 {
					   c[d][e] = c[d][e] + a[d][f] * b[f][e];
				 }
			}
		}
		for (g = 0;g < x1;g++)
		{
		System.out.printf("%d",c[g][0]);
			for (h = 1;h < y2;h++)
			{

		 System.out.printf(" %d",c[g][h]);
			}
		 System.out.print("\n");
		}
	}

}

