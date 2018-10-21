package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int I;
		int J = 0;
		int max;
		int min;
		int[][] a = new int[8][8];
		int wzy = 1;
		int rrw = 0;
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
			for (i = 0;i < row;i++)
			{
				max = a[i][0];
				for (j = 0;j < col;j++)
				{
					if (max < a[i][j])
					{
						max = a[i][j];
						J = j;
					}
				}
				min = a[i][J];
				for (I = 0;I < row;I++)
				{
					if (min > a[I][J])
					{
					  wzy = 0;
						break;
					}
				}
				if (wzy == 1)
				{
					System.out.printf("%d+%d",i,J);
					rrw++;
				}
				wzy = 1;
				J = 0;
			}
			if (rrw == 0)
			{
				System.out.print("No");
			}

		return 0;
	}



}

