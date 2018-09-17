package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i = 1;
		int j = 1;
		int m;
		int n;
		int[] x = new int[11];
		int[] y = new int[11];
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
		x[0] = a;
		y[0] = b;
		while (a > 1)
		{
			a = a / 2;
			x[i] = a;
			i++;
		}
		while (b > 1)
		{
			b = b / 2;
			y[j] = b;
			j++;
		}
		for (m = 0;m < i;m++)
		{
			for (n = 0;n < j;n++)
			{
				if (x[m] == y[n])
				{
					System.out.printf("%d",x[m]);
					return 0;
				}
			}
		}
		return 0;
	}


}

