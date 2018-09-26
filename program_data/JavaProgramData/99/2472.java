package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] age = new int[100];
		int i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] < 19)
			{
				a++;
			}
			else if (age[i] < 36)
			{
				b++;
			}
			else if (age[i] < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		a = 100 * a / (double)n;
		b = 100 * b / (double)n;
		c = 100 * c / (double)n;
		d = 100 * d / (double)n;
		System.out.printf("1-18: %.2f%%\n",a);
		System.out.printf("19-35: %.2f%%\n",b);
		System.out.printf("36-60: %.2f%%\n",c);
		System.out.printf("60??: %.2f%%\n",d);
	}
}

