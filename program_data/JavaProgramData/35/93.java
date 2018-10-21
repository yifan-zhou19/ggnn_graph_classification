package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int temp;
		int[][] f = new int[8][8];
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
					f[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		temp = m;
		for (i = 0;i < m;i++)
		{
			max[i] = f[i][0];
			temp = 0;
			for (j = 0;j < n;j++)
			{
				if (max[i] < f[i][j])
				{
					temp = j;
					max[i] = f[i][j];
				}
			}
			max[i] = temp;
		}
		for (i = 0;i < n;i++)
		{
			min[i] = f[0][i];
			temp = 0;
			for (j = 0;j < m;j++)
			{
				if (min[i] > f[j][i])
				{
					temp = j;
					min[i] = f[j][i];
				}
			}
			min[i] = temp;
		}
		for (i = 0;i < m;i++)
		{
			if (min[max[i]] == i)
			{
				System.out.printf("%d+%d",i,max[i]);
				break;
			}
		}
		if (i == m)
		{
			System.out.print("No");
		}
	}
}

