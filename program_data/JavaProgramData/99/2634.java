package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		double x1;
		double x2;
		double x3;
		double x4;
		double s1 = 0;
		double s2 = 0;
		double s3 = 0;
		double s4 = 0;
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
			if (a[i] < 19 && a[i]>0)
			{
				s1 += 1;
			}
			if (a[i] < 36 && a[i]>18)
			{
				s2 += 1;
			}
			if (a[i] < 61 && a[i]>35)
			{
				s3 += 1;
			}
			if (a[i] < 101 && a[i]>60)
			{
				s4 += 1;
			}
		}
		x1 = s1 / n * 100;
		x2 = s2 / n * 100;
		x3 = s3 / n * 100;
		x4 = s4 / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",x1,x2,x3,x4);
	}


}

