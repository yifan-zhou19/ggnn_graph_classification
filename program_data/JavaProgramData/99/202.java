package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int[] b = new int[100];
		int sum = 0;
		int n;
		int i;
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
				b[i] = Integer.parseInt(tempVar2);
			}
			if (b[i] <= 18)
			{
				a[0]++;
			}
			else if (b[i] > 18 && b[i] < 36)
			{
				a[1]++;
			}
			else if (b[i] > 35 && b[i] < 61)
			{
				a[2]++;
			}
			else
			{
				a[3]++;
			}
		}
		sum = n;
		System.out.printf("1-18: %.2lf%%\n",(double)a[0] / (double)sum * 100);
		System.out.printf("19-35: %.2lf%%\n",(double)a[1] / (double)sum * 100);
		System.out.printf("36-60: %.2lf%%\n",(double)a[2] / (double)sum * 100);
		System.out.printf("60??: %.2lf%%\n",(double)a[3] / (double)sum * 100);
		return 0;
	}
}

