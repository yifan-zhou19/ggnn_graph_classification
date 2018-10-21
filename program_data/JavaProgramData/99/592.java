package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		int[] a = new int[100];
		int i;
		int m = 0;
		int n = 0;
		int o = 0;
		int p = 0;
		double s1;
		double s2;
		double s3;
		double s4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] >= 0 && a[i] <= 18)
			{
				m = m + 1;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				n = n + 1;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				o = o + 1;
			}
			else
			{
				p = p + 1;
			}
		}
		s1 = (double)m / (double)b;
		s2 = (double)n / (double)b;
		s3 = (double)o / (double)b;
		s4 = (double)p / (double)b;
		System.out.printf("1-18: %.2lf",s1 * 100);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",s2 * 100);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",s3 * 100);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",s4 * 100);
		System.out.print("%%");
	}
}

