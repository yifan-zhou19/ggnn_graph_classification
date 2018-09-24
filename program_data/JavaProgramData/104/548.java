package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i;
		int j = 0;
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
		while (y[j] != 1)
		{
			j = j + 1;
			y[j] = y[j - 1] / 2;
		}
		j = 0;
		i = 0;
		while (x[i] < y[j])
		{
			j++;
		}
		while (x[i] != y[j])
		{
			i = i + 1;
			x[i] = x[i - 1] / 2;
			while (x[i] < y[j])
			{
				j++;
			}
		}
		System.out.printf("%d\n",x[i]);
		return 0;
	}
}

