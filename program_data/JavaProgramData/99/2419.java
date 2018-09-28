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
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		int age;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age >= 1 && age <= 18)
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
			else if (age >= 60)
			{
				d++;
			}
		}

		System.out.printf("1-18: %.2lf%%\n",(a / n) * 100);
	System.out.printf("19-35: %.2lf%%\n",(b / n) * 100);
	System.out.printf("36-60: %.2lf%%\n",(c / n) * 100);
	System.out.printf("60??: %.2lf%%\n",(d / n) * 100);




	}
}

