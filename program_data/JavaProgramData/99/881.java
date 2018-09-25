package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int[] age = new int[100];
		double a;
		double b;
		double c;
		double d;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		for (i = 0,a = b = c = d = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
				a++;
			}
			else
			{
				if (age[i] >= 19 && age[i] <= 35)
				{
					b++;
				}
				else
				{
					if (age[i] >= 36 && age[i] <= 60)
					{
						c++;
					}
					else
					{
						d++;
					}
				}
			}
		}
		System.out.printf("1-18: %.2lf%%\n",a / m * 100);
		System.out.printf("19-35: %.2lf%%\n",b / m * 100);
		System.out.printf("36-60: %.2lf%%\n",c / m * 100);
		System.out.printf("60??: %.2lf%%\n",d / m * 100);
		return 0;
	}


}

