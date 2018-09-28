package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int i;
		int j = 0;
		int k = 0;
		int h = 0;
		double gl1;
		double gl2;
		double gl3;
		double gl4;
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
			if (a[i] >= 1 && a[i] <= 18)
			{
				m = m + 1;
			}
			if (a[i] > 18 && a[i] < 36)
			{
				j = j + 1;
			}
			if (a[i] > 35 && a[i] < 61)
			{
				k = k + 1;
			}
			if (a[i] > 60)
			{
				h = h + 1;
			}
		}
		gl1 = (double)m / n * 100;
		gl2 = (double)j / n * 100;
		gl3 = (double)k / n * 100;
		gl4 = (double)h / n * 100;
		System.out.printf("1-18: %.2lf%%\n",gl1);
		System.out.printf("19-35: %.2lf%%\n",gl2);
		System.out.printf("36-60: %.2lf%%\n",gl3);
		System.out.printf("60??: %.2lf%%\n",gl4);
		return 0;
	}
}

