package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int[] x = new int[10];
		int[] y = new int[10];
		int countx = 0;
		int county = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;;i++)
		{
			if (i == 0)
			{
				x[i] = a;
			}
			else
			{
				x[i] = x[i - 1] / 2;
			}
			countx++;
			if (x[i] == 1)
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			if (i == 0)
			{
				y[i] = b;
			}
			else
			{
				y[i] = y[i - 1] / 2;
			}
			county++;
			if (y[i] == 1)
			{
				break;
			}
		}
		for (i = 0;i < countx;i++)
		{
			for (j = 0;j < county;j++)
			{
				if (x[i] == y[j])
				{
					System.out.printf("%d\n",x[i]);
					return 0;
				}
			}
		}
	}
}

