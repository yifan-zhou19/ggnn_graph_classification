package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int[] max = new int[1000];
		int[] min = new int[1000];
		int[] h = new int[1000];
		int[] l = new int[1000];
		for (i = 0;i < n;i++)
		{
			max[i] = sz[i][0];
			for (j = 0;j < m;j++)
			{
				if (max[i] < sz[i][j])
				{
					max[i] = sz[i][j];
					h[i] = j;
				}
			}
		}
		for (j = 0;j < m;j++)
		{
			min[j] = 1000;
			for (i = 0;i < n;i++)
			{
				if (min[j] > sz[i][j])
				{
					min[j] = sz[i][j];
					l[j] = i;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d+%d",i,j);
					return 0;
				}
			}
		}
		System.out.print("No");
		return 0;
	}
}

