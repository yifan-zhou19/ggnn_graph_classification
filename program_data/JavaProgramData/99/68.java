package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[4];
		double[] c = new double[4];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				b[0]++;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				b[1]++;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				b[2]++;
			}
			else
			{
				b[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			c[i] = (double)(b[i]) / n * 100;
		}
		System.out.printf("1-18: %.2lf%%\n",c[0]);
		System.out.printf("19-35: %.2lf%%\n",c[1]);
		System.out.printf("36-60: %.2lf%%\n",c[2]);
		System.out.printf("60??: %.2lf%%\n",c[3]);
	}
}

