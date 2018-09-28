package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double b = 0;
		double c = 0;
		double d = 0;
		double f = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				b++;
			}
			else if ((a[i] <= 35) && (a[i] >= 19))
			{
				c++;
			}
			else if ((a[i] <= 60) && (a[i] >= 36))
			{
				d++;
			}
			else
			{
				f++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",b / (b + c + d + f) * 100.0);
		System.out.printf("19-35: %.2lf%%\n",c / (b + c + d + f) * 100.0);
		System.out.printf("36-60: %.2lf%%\n",d / (b + c + d + f) * 100.0);
		System.out.printf("60??: %.2lf%%\n",f / (b + c + d + f) * 100.0);
		return 0;

	}
}

