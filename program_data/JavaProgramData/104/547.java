package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i;
		int j;
		int temp;
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
		if (x[0] > y[0])
		{
			temp = x[0];
			x[0] = y[0];
			y[0] = temp;
		}
		i = 0;
		while (x[i] != 1)
		{
			i++;
			x[i] = x[i - 1] / 2;
		}
		i = 0;
		j = 0;
		while (y[j] != x[i])
		{
		   j++;
		   y[j] = y[j - 1] / 2;
		   if (y[j] < x[i])
		   {
			   i++;
		   }
		}
		System.out.printf("%d\n", x[i]);
		return 0;
	}
}

