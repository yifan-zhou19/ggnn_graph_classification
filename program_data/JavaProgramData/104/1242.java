package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i;
		int j;
		int k;
		int p = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;x[i - 1] != 1;i++)
		{
			if (x[i - 1] % 2 == 0)
			{
				x[i] = x[i - 1] / 2;
			}
			if (x[i - 1] % 2 == 1)
			{
				x[i] = (x[i - 1] - 1) / 2;
			}
		}
			for (i = 1;y[i - 1] != 1;i++)
			{
			if (y[i - 1] % 2 == 0)
			{
				y[i] = y[i - 1] / 2;
			}
			if (y[i - 1] % 2 == 1)
			{
				y[i] = (y[i - 1] - 1) / 2;
			}
			}

		for (k = 0;x[k - 1] != 1 && p == 1;k++)
		{
			for (j = 0;y[j - 1] != 1;j++)
			{
				if (x[k] == y[j])
				{
				   System.out.printf("%d\n",x[k]);
				   p = 0;
				   break;
				}
			}
		}

	}

}

