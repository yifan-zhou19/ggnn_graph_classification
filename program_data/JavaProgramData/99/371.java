package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n = 0;
		int i = 0;
		int e = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] < 19 && a[i]>0)
			{
				e++;
			}
			else if (a[i] < 36 && a[i]>18)
			{
				b++;
			}
			else if (a[i] < 61 && a[i]>35)
			{
				c++;
			}
			else if (a[i] > 60)
			{
				d++;
			}
		}
		double a1 = e * 100.00 / n;
		double b1 = b * 100.00 / n;
		double c1 = c * 100.00 / n;
		double d1 = d * 100.00 / n;

		System.out.printf("1-18: %.2lf%%\n",a1);
		System.out.printf("19-35: %.2lf%%\n",b1);
		System.out.printf("36-60: %.2lf%%\n",c1);
		System.out.printf("60??: %.2lf%%\n",d1);

		return 0;
	}
}

