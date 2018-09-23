package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		for (i = 0;x[i] > 1;i++)
		{
			if (x[i] % 2 == 0)
			{
				x[i + 1] = x[i] / 2;
			}
			else
			{
				x[i + 1] = (x[i] - 1) / 2;
			}
		}
		k = i;
		for (j = 0;y[j] > 1;j++)
		{
			if (y[j] % 2 == 0)
			{
				y[j + 1] = y[j] / 2;
			}
			else
			{
				y[j + 1] = (y[j] - 1) / 2;
			}
		}
		l = j;
		for (i = 0;i <= k;i++)
		{
			for (j = 0;j <= l;j++)
			{
				if (x[i] == y[j])
				{
					System.out.printf("%d\n",y[j]);
					flag = 1;
					break;
				}
				if (flag == 1)
				{
					break;
				}
			}
		}
	}
}

