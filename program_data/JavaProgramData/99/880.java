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
		int i;
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
			if (age >= 0 && age <= 18)
			{
				a++;
			}
			if (age >= 19 && age <= 35)
			{
				b++;
			}
			if (age >= 36 && age <= 60)
			{
				c++;
			}
			if (age >= 61)
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

