package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void flag(int b[][8],int row,int col);

		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[8][8];
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
					for (j = 0;j < col;j++)
					{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
					}
		}
		flag(a, row, col);

	}
	public static void flag(int[][] b, int row, int col)
	{
		int i;
		int j;
		int count = 0;
		int[] max = new int[8];
		int[] rmax = new int[8];
		int[] cmax = new int[8];
		int[] min = new int[8];
		int[] rmin = new int[8];
		int[] cmin = new int[8];
		for (i = 0;i < row;i++)
		{
			max[i] = b[i][0];
			for (j = 0;j < col;j++)
			{
				if (b[i][j] >= max[i])
				{
					max[i] = b[i][j];
					cmax[i] = j;
				}
			}

				rmax[i] = i;

		}
		//for(j=0;j<row;j++)
			//printf("%d",cmax[j]);
		for (j = 0;j < col;j++)
		{
			min[j] = b[0][j];
			for (i = 0;i < row;i++)
			{
				if (b[i][j] <= min[j])
				{
					min[j] = b[i][j];
					rmin[j] = i;
				}
			}

					cmin[j] = j;
		}
	//for(i=0;i<col;i++)
	//		printf("%d",rmin[i]);
		if (row <= col)
		{
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
				if ((rmax[i] == rmin[j]) && (cmax[i] == cmin[j]))
				{
					System.out.printf("%d+%d",rmax[i],cmax[i]);
					count = count + 1;
				}
				}
			}
		}
		if (count == 0)
		{
			System.out.print("No");
		}






	}

}

