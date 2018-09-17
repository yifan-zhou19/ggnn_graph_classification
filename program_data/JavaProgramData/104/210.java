package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] x = new int[10];
		int[] y = new int[10];
		int a;
		int b;
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
		for (i = 9;;i--)
		{
			x[i] = a;
			a /= 2;
			if (x[i] == 1)
			{
				break;
			}
		}
		for (j = i;j < 10;j++)
		{
			x[j - i] = x[j];
		}
		for (i = 9;;i--)
		{
			y[i] = b;
			b /= 2;
			if (y[i] == 1)
			{
				break;
			}
		}
		for (j = i;j < 10;j++)
		{
			y[j - i] = y[j];
		}
		for (i = 0;;i++)
		{
			if (x[i] != y[i])
			{
				System.out.printf("%d",x[i - 1]);
				break;
			}
		}
	}
}

