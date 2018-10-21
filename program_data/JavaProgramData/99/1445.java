package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
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
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18)
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
			else if (age >= 61)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)a / (double)n * 100.00);
		System.out.printf("19-35: %.2lf%%\n",(double)b / (double)n * 100.00);
		System.out.printf("36-60: %.2lf%%\n",(double)c / (double)n * 100.00);
		System.out.printf("60??: %.2lf%%\n",(double)d / (double)n * 100.00);
	}

}

