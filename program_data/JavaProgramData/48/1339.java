package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}

		if (d == 1)
		{
				int[][] sz =
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 1 * n, 1 * n, 1 * n, 0, 0, 0},
					{0, 0, 0, 1 * n, 2 * n, 1 * n, 0, 0, 0},
					{0, 0, 0, 1 * n, 1 * n, 1 * n, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0}
				};
		int i;
		int j;
			for (i = 0;i < 9;i++)
			{
						 for (j = 0;j < 8;j++)
						 {
										  System.out.printf("%d ",sz[i][j]);


						 }
						 System.out.printf("%d\n",sz[i][8]);
			}
		}
		if (d == 2)
		{
				 int[][] sz =
				 {
					 {0, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 0, 1 * n, 2 * n, 3 * n, 2 * n, 1 * n, 0, 0},
					 {0, 0, 2 * n, 6 * n, 8 * n, 6 * n, 2 * n, 0, 0},
					 {0, 0, 3 * n, 8 * n, 12 * n, 8 * n, 3 * n, 0, 0},
					 {0, 0, 2 * n, 6 * n, 8 * n, 6 * n, 2 * n, 0, 0},
					 {0, 0, 1 * n, 2 * n, 3 * n, 2 * n, 1 * n, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0}
				 };
						   int i;
						   int j;
		for (i = 0;i < 9;i++)
		{
						 for (j = 0;j < 8;j++)
						 {
										  System.out.printf("%d ",sz[i][j]);


						 }
						 System.out.printf("%d\n",sz[i][8]);
		}
		}

		if (d == 3)
		{
				 int[][] sz =
				 {
					 {0, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 1 * n, 3 * n, 6 * n, 7 * n, 6 * n, 3 * n, 1 * n, 0},
					 {0, 3 * n, 12 * n, 24 * n, 30 * n, 24 * n, 12 * n, 3 * n, 0},
					 {0, 6 * n, 24 * n, 51 * n, 63 * n, 51 * n, 24 * n, 6 * n, 0},
					 {0, 7 * n, 30 * n, 63 * n, 80 * n, 63 * n, 30 * n, 7 * n, 0},
					 {0, 6 * n, 24 * n, 51 * n, 63 * n, 51 * n, 24 * n, 6 * n, 0},
					 {0, 3 * n, 12 * n, 24 * n, 30 * n, 24 * n, 12 * n, 3 * n, 0},
					 {0, 1 * n, 3 * n, 6 * n, 7 * n, 6 * n, 3 * n, 1 * n, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0}
				 };
						   int i;
						   int j;
		for (i = 0;i < 9;i++)
		{
						 for (j = 0;j < 8;j++)
						 {
										  System.out.printf("%d ",sz[i][j]);


						 }
						 System.out.printf("%d\n",sz[i][8]);
		}
		}

		if (d == 4)
		{
				int[][] sz =
				{
					{1 * n, 4 * n, 10 * n, 16 * n, 19 * n, 16 * n, 10 * n, 4 * n, 1 * n},
					{4 * n, 20 * n, 52 * n, 88 * n, 104 * n, 88 * n, 52 * n, 20 * n, 4 * n},
					{10 * n, 52 * n, 142 * n, 244 * n, 292 * n, 244 * n, 142 * n, 52 * n, 10 * n},
					{16 * n, 88 * n, 244 * n, 428 * n, 512 * n, 428 * n, 244 * n, 88 * n, 16 * n},
					{19 * n, 104 * n, 292 * n, 512 * n, 616 * n, 512 * n, 292 * n, 104 * n, 19 * n},
					{16 * n, 88 * n, 244 * n, 428 * n, 512 * n, 428 * n, 244 * n, 88 * n, 16 * n},
					{10 * n, 52 * n, 142 * n, 244 * n, 292 * n, 244 * n, 142 * n, 52 * n, 10 * n},
					{4 * n, 20 * n, 52 * n, 88 * n, 104 * n, 88 * n, 52 * n, 20 * n, 4 * n},
					{1 * n, 4 * n, 10 * n, 16 * n, 19 * n, 16 * n, 10 * n, 4 * n, 1 * n}
				};
						   int i;
						   int j;
		for (i = 0;i < 9;i++)
		{
						 for (j = 0;j < 8;j++)
						 {
										  System.out.printf("%d ",sz[i][j]);


						 }
						 System.out.printf("%d\n",sz[i][8]);
		}
		}


			return 0;
	}
}

