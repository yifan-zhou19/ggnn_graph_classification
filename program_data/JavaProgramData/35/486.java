package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[100][100];
		int h;
		int l;
		int i;
		int j;
		int d = 0;
		int maxh;
		int minl;
		int y;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < h;i++)
		{
			y = 0;
			for (j = 0;j < l;j++)
			{
				if (x[i][j] > d)
				{
					d = x[i][j];
				}
			}
			for (j = 0;j < l;j++)
			{
				if (x[i][j] == d)
				{
					maxh = i;
					minl = j;
				}
			}
			for (int m = 0;m < h;m++)
			{
			if (x[maxh][minl] > x[m][minl])
			{
				y++;
			}
			}
			if (y == 0)
			{
				System.out.printf("%d+%d",maxh,minl);
			}
				 break;
		}


	if (y > 0)
	{
			System.out.print("No");
	}
		return 0;
	}




}

