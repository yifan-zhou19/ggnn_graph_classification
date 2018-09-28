package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int[] max = new int[8];
		int[] min = new int[8];
		int i;
		int k = 0;
		int j;
		int m;
		int n;
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
			max[i] = a[i][0];
		}
		for (i = 0;i < n;i++)
		{
			min[i] = a[0][i];
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (max[i] < a[i][j])
				{
					max[i] = a[i][j];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < m;j++)
			{
				if (min[i] > a[j][i])
				{
					min[i] = a[j][i];
				}
			}
		}
		for (i = 0;i < m;)
		{
			for (j = 0;j < n;j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d+%d",i,j);
					k = 1;
				}
			}
			i++;
			if (i + j == m + n && k == 0)
			{
				System.out.print("No");
			}
		}
	}

}

