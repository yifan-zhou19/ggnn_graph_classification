package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int[] a = new int[100];
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
			if (a[i] < 19)
			{
				s1++;
			}
			if ((a[i] > 18) && (a[i] < 36))
			{
				s2++;
			}
			if ((a[i] > 35) && (a[i] < 61))
			{
				s3++;
			}
			if (a[i] > 60)
			{
				s4++;
			}
		}
		System.out.printf("1-18: %.2f%%\n",(float)s1 * 100 / n);
		System.out.printf("19-35: %.2f%%\n",(float)s2 * 100 / n);
		System.out.printf("36-60: %.2f%%\n",(float)s3 * 100 / n);
		System.out.printf("60??: %.2f%%\n",(float)s4 * 100 / n);
		return 0;
	}
}

