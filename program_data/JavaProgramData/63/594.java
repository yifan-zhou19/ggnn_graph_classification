package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
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
		int[][] a = new int[101][101];
		int i;
		int j;
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y1 - 1;j++)
			{
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar3);
				  }

			}

		}

		int x2;
		int y2;
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
		int[][] b = new int[101][101];

		for (i = 0;i <= x2 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				  String tempVar6 = ConsoleInput.scanfRead();
				  if (tempVar6 != null)
				  {
					  b[i][j] = Integer.parseInt(tempVar6);
				  }

			}

		}


		int[][] c = new int[101][101];
		int x3;
		int y3;
		x3 = x1;
		y3 = y2;
		for (i = 0;i <= x3 - 1;i++)
		{
			 for (j = 0;j <= y3 - 1;j++)
			 {
							 int he = 0;
							 for (int k = 0;k <= x2;k++)
							 {
							   he = he + a[i][k] * b[k][j];
							 }
							  c[i][j] = he;
			 }

		}


		for (i = 0;i <= x1 - 1;i++)
		{
				 for (j = 0;j <= y2 - 1;j++)
				 {

				   if (j == 0)
				   {
					   System.out.printf("%d",c[i][j]);
				   }
				   else
				   {
					   System.out.printf(" %d",c[i][j]);
				   }
				 }
			 System.out.print("\n");

		}


		System.in.read();
		System.in.read();

	}

}

