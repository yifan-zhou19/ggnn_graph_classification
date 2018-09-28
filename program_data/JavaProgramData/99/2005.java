package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		int[] man = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(man[i]) = Integer.parseInt(tempVar2);
			}
		}
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		for (i = 0;i < n;i++)
		{
			if (man[i] >= 1 && man[i] <= 18)
			{
				a++;
			}
			if (man[i] >= 19 && man[i] <= 35)
			{
				b++;
			}
			if (man[i] >= 36 && man[i] <= 60)
			{
				c++;
			}
			if (man[i] >= 61)
			{
				d++;
			}
		}
		double x;
		double y;
		double z;
		double w;
		x = 100 * (a / n);
		y = 100 * (b / n);
		z = 100 * (c / n);
		w = 100 * (d / n);
		System.out.printf("1-18: %.2lf%%\n",x);
		System.out.printf("19-35: %.2lf%%\n",y);
		System.out.printf("36-60: %.2lf%%\n",z);
		System.out.printf("60??: %.2lf%%\n",w);
		return 0;
	}
}

