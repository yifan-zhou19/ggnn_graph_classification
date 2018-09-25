package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
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
			if (a[i] >= 1 && a[i] <= 18)
			{
				b++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				c++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				d++;
			}
			if (a[i] >= 61)
			{
				e++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)b / n * 100);
		System.out.printf("19-35: %.2lf%%\n",(double)c / n * 100);
		System.out.printf("36-60: %.2lf%%\n",(double)d / n * 100);
		System.out.printf("60??: %.2lf%%\n",(double)e / n * 100);
		return 0;
	}
}

