package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x0;
		int y0;
		int i;
		int j;
		int k;
		int l = 10000;
		int[] x = new int[10];
		int[] y = new int[10];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x0 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y0 = Integer.parseInt(tempVar2);
		}
		x[0] = x0;
		y[0] = y0;
		for (i = 0;i < 9;i++)
		{
			x[i + 1] = x[i] / 2;
		}
		for (i = 0;i < 9;i++)
		{
			y[i + 1] = y[i] / 2;
		}
		//	printf("%d",x[0]);
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (x[i] == y[j])
				{
					l = i;
					break;
				}
			}
		if (i == l)
		{
			break;
		}
		}
			System.out.printf("%d",x[i]);
	}


}

