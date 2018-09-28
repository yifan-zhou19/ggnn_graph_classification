package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[10][10];
		int m;
		int n;
		int i;
		int j;
		int a;
		int b;
		int k;
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			int max = 0;
			int maxindex;
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] > max)
				{
					max = sz[i][j];
				maxindex = j;
				}
			}
			int min = sz[0][maxindex];
			int minindex = 0;
			for (k = 0;k < m;k++)
			{
				if (sz[k][maxindex] < min)
				{
					minindex = k;
					min = sz[k][maxindex];
				}
			}
			if (minindex == i)
			{
				System.out.printf("%d+%d",i,maxindex);
				return 0;
			}
		}
				System.out.print("No");
			return 0;
	}

}

