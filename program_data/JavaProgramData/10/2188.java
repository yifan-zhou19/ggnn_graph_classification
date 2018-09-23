package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] high = new int[25];
		int i;
		int j;
		int[][] x = new int[25][2];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				high[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
		x[i][0] = 1;
		}
		for (i = 0;i < n;i++)
		{
		x[i][1] = 0;
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if ((high[j] >= high[i]) && (x[j][0] >= x[i][0]))
				{
						x[i][0] = x[j][0] + 1;
				}
				if (x[j][1] > x[i][1])
				{
					x[i][1] = x[j][1];
				}
				if (x[j][0] > x[i][1])
				{
					x[i][1] = x[j][0];
				}
			}
		}
		i--;
		if (x[i][0] < x[i][1])
		{
			x[i][0] = x[i][1];
		}
		System.out.printf("%d",x[i][0]);
	}



}

