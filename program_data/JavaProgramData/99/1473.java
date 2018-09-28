package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] age = new int[100];
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] <= 18)
			{
				a++;
			}
			if (age[i] >= 19 && age[i] <= 35)
			{
				b++;
			}
			if (age[i] >= 36 && age[i] <= 60)
			{
				c++;
			}
			if (age[i] > 60)
			{
				d++;
			}
		}
		a = a / n * 100;
		b = b / n * 100;
		c = c / n * 100;
		d = d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
	}


}

