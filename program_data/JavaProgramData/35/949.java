package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int r;
		int c;
		int[][] a = new int[10][10];
		int[] rmax = new int[10];
		int[] cp = new int[10];
		int[] cmin = new int[10];
		int rn = -1;
		int cn = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < r;i++)
		{
			rmax[i] = a[i][0];
			cp[i] = 0;
			for (j = 0;j < c;j++)
			{
				if (a[i][j] > rmax[i])
				{
					rmax[i] = a[i][j];
					cp[i] = j;
				}
			}
		}
		for (j = 0;j < c;j++)
		{
			cmin[j] = a[0][j];
			for (i = 0;i < r;i++)
			{
				if (a[i][j] < cmin[j])
				{
					cmin[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < r;i++)
		{
			if (rmax[i] == cmin[cp[i]])
			{
				rn = i;
				cn = cp[i];
			}
		}
		if (rn != -1)
		{
			System.out.printf("%d+%d\n",rn,cn);
		}
		else
		{
			System.out.print("No\n");
		}
	}

}

