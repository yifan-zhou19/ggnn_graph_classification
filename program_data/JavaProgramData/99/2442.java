package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int b4 = 0;
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
			if (a[i] <= 18)
			{
				b1 += 1;
			}
			else if ((a[i] >= 19) && (a[i] <= 35))
			{
				b2 += 1;
			}
			else if ((a[i] >= 36) && (a[i] <= 60))
			{
				b3 += 1;
			}
			else if (a[i] > 60)
			{
				b4 += 1;
			}
		}
		int sum = 0;
		double c1;
		double c2;
		double c3;
		double c4;
		sum = b1 + b2 + b3 + b4;
		c1 = (double)b1 / sum * 100;
		c2 = (double)b2 / sum * 100;
		c3 = (double)b3 / sum * 100;
		c4 = (double)b4 / sum * 100;
		System.out.printf("1-18: %.2lf%%\n",c1);
		System.out.printf("19-35: %.2lf%%\n",c2);
		System.out.printf("36-60: %.2lf%%\n",c3);
		System.out.printf("60??: %.2lf%%\n",c4);
		return 0;
	}


}

