package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[4];
		double[] c = new double[4];
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
				b[0] = b[0] + 1;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				b[1] = b[1] + 1;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				b[2] = b[2] + 1;
			}
			else if (a[i] > 60)
			{
				b[3] = b[3] + 1;
			}
		}
		c[0] = (double)b[0] / n * 100;
		c[1] = (double)b[1] / n * 100;
		c[2] = (double)b[2] / n * 100;
		c[3] = (double)b[3] / n * 100;
		System.out.printf("1-18: %.2f%%\n",c[0]);
		System.out.printf("19-35: %.2f%%\n",c[1]);
		System.out.printf("36-60: %.2f%%\n",c[2]);
		System.out.printf("60??: %.2f%%\n",c[3]);
	}

}

