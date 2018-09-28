package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int min;
		int[][] n = new int[8][8];
		int[] max = new int[8];
		int l;
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
					n[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			max[i] = n[i][0];
			l = 0;
			for (j = 0;j < b - 1;j++)
			{
				if (max[i] < n[i][j + 1])
				{
					max[i] = n[i][j + 1];
					l = j + 1;
				}
			}
			min = max[i];
			for (k = 0;k < a;k++)
			{
				if (min > n[k][l])
				{
					min = 0;
				}
			}
			if (min != 0)
			{
				break;
			}
		}
		if (min == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",i,l);
		}
		return 0;
	}
}

