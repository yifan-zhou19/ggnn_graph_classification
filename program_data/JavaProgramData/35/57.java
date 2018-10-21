package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[10][10];
		int i;
		int j;
		int k;
		int m;
		int n;
		int s = 0;
		int max;
		int min;
		int weizhi;
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
			weizhi = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					weizhi = j;
				}
			}
			min = a[0][weizhi];
			for (k = 1;k != i && k < m;k++)
			{
				if (a[k][weizhi] < a[i][weizhi])
				{
				break;
				}
			}
			if (k == m)
			{
				System.out.printf("%d+%d",i,weizhi);
					s++;
			}
			if (s == 1)
			{
				break;
			}
		}
		if (i == m)
		{
			System.out.print("No");
		}
	}
}

