package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int n;
		int age;
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

			if (age <= 18)
			{
				a++;
			}
			else if (age >= 19 && age < 36)
			{
				b++;
			}
			else if (age >= 36 && age <= 60)
			{
				c++;
			}
		else if (age > 60)
		{
				d++;
		}

		}
		System.out.printf("1-18: %.2lf",a * 100.0 / n);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",b * 100.0 / n);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",c * 100.0 / n);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",d * 100.0 / n);
		System.out.print("%%\n");
		return 0;
	}




}

