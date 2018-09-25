package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] age = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
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
			else if (age[i] > 18 && age[i] <= 35)
			{
				b++;
			}
			else if (age[i] > 35 && age[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf",(a * 1.00) * 100 / n);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",(b * 1.00) * 100 / n);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",(c * 1.00) * 100 / n);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",(d * 1.00) * 100 / n);
		System.out.print("%%\n");
		return 0;
	}
}

