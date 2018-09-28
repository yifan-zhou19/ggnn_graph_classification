package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int t = 0;
		int z;
		int x1;
		int x2;
		int y1;
		int y2;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		 m = (x2 < y1)?x2:y1;
		for (i = 0;i < x1;i++)
		{
		   for (j = 0;j < y2;j++)
		   {
				t = 0;
			for (z = 0;z < m;z++)
			{
				t = t + a[i][z] * b[z][j];

			}
			c[i][j] = t;
		   }
		}

		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
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



	}
}

