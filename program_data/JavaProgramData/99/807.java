package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[1000];
		int i;
		int[] c = new int[4];
		int l;
		double[] t = new double[4];
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
				c[0] = c[0] + 1;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				c[1] = c[1] + 1;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				c[2] = c[2] + 1;
			}
			else
			{
				c[3] = c[3] + 1;
			}
		}
		l = c[0] + c[1] + c[2] + c[3];
		for (i = 0;i < 4;i++)
		{
		t[i] = ((c[i] * 1.0) / l) * 100;
		}
		System.out.printf("1-18: %.2lf%%\n",t[0]);
		System.out.printf("19-35: %.2lf%%\n",t[1]);
		System.out.printf("36-60: %.2lf%%\n",t[2]);
		System.out.printf("60??: %.2lf%%\n",t[3]);
	}


}

