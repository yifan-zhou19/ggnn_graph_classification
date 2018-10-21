package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int b1;
		int b2;
		int b3;
		int b4;
		double s1;
		double s2;
		double s3;
		double s4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b1 = b2 = b3 = b4 = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] < 19)
			{
				b1++;
			}
			if (a[i] > 18 && a[i] < 36 == 1)
			{
				b2++;
			}
			if (a[i] > 35 && a[i] < 61 == 1)
			{
				b3++;
			}
			if (a[i] > 60)
			{
				b4++;
			}
		}
		s1 = (double)(b1) / (double)(n) * 100;
		s2 = (double)b2 / (double)n * 100;
		s3 = (double)b3 / (double)n * 100;
		s4 = (double)b4 / (double)n * 100;
		System.out.printf("1-18: %.2lf%%\n",s1);
		System.out.printf("19-35: %.2lf%%\n",s2);
		System.out.printf("36-60: %.2lf%%\n",s3);
		System.out.printf("60??: %.2lf%%\n",s4);
		return 0;
	}
}

