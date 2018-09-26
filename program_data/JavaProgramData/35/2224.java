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
		int p;
		int q;
		int t = 0;
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
			p = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					p = j;
				}
			}
			min = a[0][p];
			q = 0;
			for (i = 1;i < m;i++)
			{
				if (a[i][p] < min)
				{
					min = a[i][p];
					q = i;
				}
			}
			if (max == min)
			{
				System.out.printf("%d+%d\n",q,p);
				t = t + 1;
			}
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}



}

