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
		int k;
		int max;
		int min;
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
				}
			}
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == max)
				{
					break;
				}
			}
			min = max;
			for (k = 0;k < m;k++)
			{
				if (a[k][j] < min)
				{
					min = a[k][j];
				}
			}
			if (max == min)
			{
				break;
			}
		}
		if (i == m)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",i,j);
		}
	}
}

