package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[12];
		int[] y = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[1] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[1] = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int k;
		i = 1;
		while (x[i] >= 1)
		{
			if (x[i] % 2 == 0)
			{
				x[i + 1] = x[i] / 2;
			}
			else
			{
				x[i + 1] = (x[i] - 1) / 2;
			}
			i++;
		}
		i = 1;
		while (y[i] >= 1)
		{
			if (y[i] % 2 == 0)
			{
				y[i + 1] = y[i] / 2;
			}
			else
			{
				y[i + 1] = (y[i] - 1) / 2;
			}
			i++;
		}
		for (j = 1;j < 11;j++)
		{
			for (k = 1;k <= i;k++)
			{
				if (x[j] == y[k])
				{
					System.out.printf("%d",x[j]);
					break;
				}
			}
			if (x[j] == y[k])
			{
				break;
			}
		}
	}
}

