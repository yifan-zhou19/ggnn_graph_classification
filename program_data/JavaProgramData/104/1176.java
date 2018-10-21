package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int i;
		int j;
		int indicator = 0;
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
		for (i = 0;;i++)
		{
			if (x[i] == 1)
			{
				break;
			}
			if (x[i] % 2 == 0)
			{
				x[i + 1] = x[i] / 2;
			}
			else
			{
				x[i + 1] = (x[i] - 1) / 2;
			}
		}
		for (i = 0;;i++)
		{
			if (y[i] == 1)
			{
				break;
			}
			if (y[i] % 2 == 0)
			{
				y[i + 1] = y[i] / 2;
			}
			else
			{
				y[i + 1] = (y[i] - 1) / 2;
			}
		}
		for (i = 0;i < 10;i++)
		{
			if (x[i] != 0)
			{
			for (j = 0;j < 10;j++)
			{
				if ((y[j] != 0) && (x[i] == y[j]))
				{
					System.out.printf("\n%d",x[i]);
					indicator = 1;
				}
				if (indicator == 1)
				{
					break;
				}
			}
			}
			if (indicator == 1)
			{
				break;
			}
		}
	}
}

