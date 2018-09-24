package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int max;
		int min;
		int p = 0;
		int u = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			max = a[i][0];
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					p = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				min = a[i][p];
				if (a[j][p] < a[i][p])
				{
					min = a[j][p];
				}
			}
			if (max == min)
			{
				System.out.printf("%d+%d",i,p);
				u = 1;
				break;
			}

		}
			if (u == 0)
			{
				System.out.print("No");
			}
	}



}

