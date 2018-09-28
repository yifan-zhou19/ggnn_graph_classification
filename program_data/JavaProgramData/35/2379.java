package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int m;
		int n;
		int c = 0;
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
		int[][] sz = new int[8][8];
		int[] max = new int[8];
		int[] min = {2222, 2222, 2222, 2222, 2222, 2222, 2222, 2222};
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				if (sz[i][j] > max[i])
				{
					max[i] = sz[i][j];
				}
			}
		}
		for (j = 0;j < b;j++)
		{
		for (i = 0;i < a;i++)
		{

				if (sz[i][j] < min[j])
				{
						min[j] = sz[i][j];
				}
		}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
					if (max[i] == min[j])
					{
						c = 1;
						m = i;
						n = j;
						break;
					}
			}
		}

		if (c == 1)
		{
			System.out.printf("%d+%d",m,n);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

