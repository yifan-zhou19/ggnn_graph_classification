package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int age;
		int[] u = new int[100];
		int i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i] = Integer.parseInt(tempVar2);
			}
		}
	for (i = 0;i < n;i++)
	{
		if (u[i] >= 1 && u[i] <= 18)
		{
			a += 1.0 / n;
		}
	if (u[i] >= 19 && u[i] <= 35)
	{
		b += 1.0 / n;
	}
	if (u[i] >= 36 && u[i] <= 60)
	{
		c += 1.0 / n;
	}
	if (u[i] > 60)
	{
		d += 1.0 / n;
	}
	}
	System.out.printf("1-18: %.2lf%%\n",100 * a);
	System.out.printf("19-35: %.2lf%%\n",100 * b);
	System.out.printf("36-60: %.2lf%%\n",100 * c);
	System.out.printf("60??: %.2lf%%\n",100 * d);
	}

}

