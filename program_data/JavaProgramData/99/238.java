package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int age;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		double q;
		double w;
		double e;
		double r;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18 && age >= 1)
			{
				a++;
			}
			else if (age >= 19 && age <= 35)
			{
				b++;
			}
			else if (age >= 36 && age <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",100.0 * a / n);
		System.out.printf("19-35: %.2lf%%\n",100.0 * b / n);
		System.out.printf("36-60: %.2lf%%\n",100.0 * c / n);
		System.out.printf("60??: %.2lf%%\n",100.0 * d / n);

		return 0;
	}
}

