package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int k = 0;
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
			for (j = 0;j < n;j++)
			{
				max[i] = a[i][j] > max[i] != 0?a[i][j]:max[i];
			}
			}
			for (j = 0;j < n;j++)
			{
				min[j] = a[1][j];
				for (i = 0;i < m;i++)
				{
					min[j] = a[i][j] < min[j] != 0?a[i][j]:min[j];
				}
			}
			for (i = 0;i < m;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d+%d\n",i,j);
				k = 1;
				}
			}
			}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}



}

