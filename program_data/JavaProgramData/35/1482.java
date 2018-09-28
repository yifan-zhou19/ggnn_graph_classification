package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int row;
		int col;
		int[] max = new int[8];
		int m;
		int k;
		int n;
		char q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			col = Integer.parseInt(tempVar3);
		}
		n = 0;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}

			}
		max[i] = 0;
		}


		for (i = 0;i < row;i++)
		{
		   m = 1;

			for (j = 0;j < col;j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
			}
			for (j = 0;j < col;j++)
			{
				if (max[i] == a[i][j])
				{

					for (k = 0;k < row;k++)
					{
						if (max[i] > a[k][j])
						{
							m = 0;
						}
					}
						if (m == 1)
						{
							System.out.printf("%d+%d",i,j);
							n = 1;
						}

				}
			}
		}
		if (n == 0)
		{
			System.out.print("No");
		}



	return 0;
	}



}

