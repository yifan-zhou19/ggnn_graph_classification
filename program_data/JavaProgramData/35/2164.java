package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int[][] area = new int[8][8];
		int i;
		int j;
		int k;
		int[] max = new int[8];
		int[] col = new int[8];
		int[] min = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				area[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b - 1;j++)
			{
				max[i] = area[i][0];
				col[i] = 0;
				if (area[i][j] < area[i][j + 1])
				{
				max[i] = area[i][j + 1];
				col[i] = j + 1;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (k = 0;k < a - 1;k++)
			{
				min[i] = area[0][col[i]];
				if (area[k][col[i]] > area[k + 1][col[i]])
				{
				min[i] = area[k + 1][col[i]];
				}
			}
			if (max[i] == min[i])
			{
			System.out.printf("%d+%d",col[i],i);
			break;
			}
			if (i != a - 1)
			{
				continue;
			}
		System.out.print("No");
		}

	   return 0;

	}
}

