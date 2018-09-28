package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int[] max = new int[8];
		int[] min = new int[8];
		int[] arrow = new int[8];
		int[] low = new int[8];
		int m;
		int n;
		int i;
		int j;
		int p;
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
			max[i] = a[i][0];
		if (a[i][j] > max[i])
		{
			max[i] = a[i][j];
		arrow[i] = j;
		}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
			min[j] = a[0][j];
		if (a[i][j] < min[j])
		{
			min[j] = a[i][j];
		low[j] = i;
		}
			}
		}

		for (i = 0,p = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (max[i] = min[j] != 0 && low[j] == i && arrow[i] == j)
			{
			p = 1;
			System.out.printf("%d+%d",i,j);
		break;
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

