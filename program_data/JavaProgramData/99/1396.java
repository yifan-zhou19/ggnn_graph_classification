package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double b;
		double c;
		double d;
		double e;
		int[] a = new int[AGE];
		int s1;
		int s2;
		int s3;
		int s4 = 0;
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
				s1 = s1 + 1;
			}
			else if (a[i] <= 35)
			{
				s2 = s2 + 1;

			}
			else if (a[i] <= 60)
			{
				s3 = s3 + 1;

			}
			else
			{
				s4 = s4 + 1;

			}
			  }
			  b = (double)100 * s1 / n;
			  c = (double)100 * s2 / n;
			  e = (double)100 * s4 / n;
			  d = 100 - b - c - e;
			System.out.printf("1-18: %.2lf%%\n",b);
			System.out.printf("19-35: %.2lf%%\n",c);
			System.out.printf("36-60: %.2lf%%\n",d);
			System.out.printf("60??: %.2lf%%\n",e);
			return 0;
	}
}

