package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int[] min = new int[8];
		int[] max = new int[8];
		int i;
		int j;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x;i++)
		{
			max[i] = -1;
			for (j = 0;j < y;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
			}
		}
		for (j = 0;j < y;j++)
		{
			min[j] = 10000;
			for (i = 0;i < x;i++)
			{
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				if (a[i][j] == min[j] && a[i][j] == max[i])
				{
					System.out.printf("%d+%d",i,j);
					break;
				}
			}
			if (j != y)
			{
				break;
			}
		}
		if (i == x && j == y)
		{
			System.out.print("No");
		}
		return 0;
	}
}

