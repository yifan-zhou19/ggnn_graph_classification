package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int i;
		int k;
		int m;
		int n;
		int e;
		int p = 0;
		int[] max = new int[8];
		int[] min = new int[8];
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
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			max[i] = sz[i][0];
			for (k = 0;k < n;k++)
			{
				if (sz[i][k] > max[i])
				{
					e = max[i];
					max[i] = sz[i][k];
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			min[k] = sz[0][k];
			for (i = 0;i < m;i++)
			{
				if (sz[i][k] < min[k])
				{
					e = min[k];
					min[k] = sz[i][k];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (max[i] == min[k])
				{

			System.out.printf("%d+%d",i,k);
			p++;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
			return 0;
	}


}

