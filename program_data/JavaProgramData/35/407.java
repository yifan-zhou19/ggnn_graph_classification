package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int h;
		int l;
		int i;
		int j;
		int[] max = new int[8];
		int[] min = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int[][] num = new int[8][8];
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			max[i] = num[i][0];
			for (j = 0;j < l;j++)
			{
				if (max[i] < num[i][j])
				{
					max[i] = num[i][j];
				}
			}
		}
		for (j = 0;j < l;j++)
		{
			min[j] = num[0][j];
			for (i = 0;i < h;i++)
			{
				if (min[j] > num[i][j])
				{
					min[j] = num[i][j];
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d+%d", i,j);
				}
			}
		}
		System.out.print("No");
	}


}

