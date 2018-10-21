package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		double n;
		double age;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (double i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Double.parseDouble(tempVar2);
			}
				if (age < 19)
				{
					a++;
				}
				else if ((age > 18) && (age < 36))
				{
					b++;
				}
				else if ((age > 35) && (age < 61))
				{
					c++;
				}
				else if (age > 59)
				{
					d++;
				}
		}
		 System.out.printf("1-18: %.2lf%%\n",100 * a / n);
	System.out.printf("19-35: %.2lf%%\n",100 * b / n);
	System.out.printf("36-60: %.2lf%%\n",100 * c / n);
	System.out.printf("60??: %.2lf%%\n",100 * d / n);
	//scanf("%lf",&age);
		return 0;
	}

}

