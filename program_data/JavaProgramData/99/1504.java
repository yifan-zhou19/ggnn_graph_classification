package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int n;
		int year;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double e;
		double f;
		double g;
		double h;
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
			year = Integer.parseInt(tempVar2);
		}
		if (year <= 18 && year >= 1)
		{
			a++;
		}
		else if (year <= 35 && year >= 19)
		{
			b++;
		}
		else if (year <= 60 && year >= 36)
		{
			c++;
		}
		else if (year >= 60)
		{
			d++;
		}
		}
		System.out.printf("1-18: %.2lf",(double)a / n * 100);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",(double)b / n * 100);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",(double)c / n * 100);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",(double)d / n * 100);
		System.out.print("%%\n");





	return 0;
	}
}

