package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[8][8];
		int max;
		int lie;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			max = a[i][0];
			lie = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > max)
				{
				max = a[i][j];
				lie = j;
				}
			}
			for (k = 1;k < m;k++)
			{
				if (a[i][lie] >= a[k][lie])
				{
					break;
				}
			}
			if (k == m)
			{
				System.out.printf("%d+%d",i,lie);
				break;
			}
		}
		if (i >= m)
		{
			System.out.print("No");
		}
		return 0;
	}
}

