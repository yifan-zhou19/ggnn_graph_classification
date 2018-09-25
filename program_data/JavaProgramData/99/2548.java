package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		int i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		int[] age = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
				A += 1;
			}
			else if (19 <= age[i] != 0 && age[i] <= 35)
			{
				B += 1;
			}
			else if (36 <= age[i] != 0 && age[i] <= 60)
			{
				C += 1;
			}
			else if (age[i] > 60)
			{
				D += 1;
			}
		}

		a = 100 * A / n;
		b = 100 * B / n;
		c = 100 * C / n;
		d = 100 * D / n;

		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n", b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%",d);

		return 0;
	}
}

