package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x = 0;
		int a;
		int b;
		int[][] N = new int[10][10];
		int i;
		int j;
		int[] max = new int[10];
		int[] min = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
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
					N[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				if (N[i][j] > max[i])
				{
					max[i] = N[i][j];
				}
			}
		}
		for (j = 0;j < b;j++)
		{
			for (i = 0;i < a;i++)
			{
				if (N[i][j] < min[j])
				{
					min[j] = N[i][j];
				}
			}
		}

		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				if (max[i] == min[j])
				{
					x = 1;
					System.out.printf("%d+%d",i,j);
				}
			}
		}
		if (x == 0)
		{
			System.out.print("No");
		}

	}
}

