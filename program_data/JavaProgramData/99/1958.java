package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
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
		int[] s = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(s[i]) = Integer.parseInt(tempVar2);
			}
			if (s[i] <= 18)
			{
				a++;
			}
			if ((s[i] <= 35) && (s[i]>18))
			{
				b++;
			}
			if ((s[i] <= 60) && (s[i]>35))
			{
				c++;
			}
			if (s[i] > 60)
			{
				d++;
			}
		}
		a /= n;
		b /= n;
		c /= n;
		d /= n;

		System.out.printf("1-18: %.2lf%%\n",a * 100.0);
		System.out.printf("19-35: %.2lf%%\n",b * 100.0);
		System.out.printf("36-60: %.2lf%%\n",c * 100.0);
		System.out.printf("60??: %.2lf%%\n",d * 100.0);
		return 0;
	}
}

