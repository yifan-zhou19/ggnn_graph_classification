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
		double B;
		double C;
		double D;
		double E;
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
			if (a[i] >= 0 && a[i] <= 18)
			{
				b++;
			}
			if (a[i] > 18 && a[i] <= 35)
			{
				c++;
			}
			if (a[i] > 35 && a[i] <= 60)
			{
				d++;
			}
			if (a[i] > 60)
			{
				e++;
			}
		}
			 B = (double)b / n;
			 C = (double)c / n;
			 D = (double)d / n;
			 E = (double)e / n;
			 System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",B * 100,C * 100,D * 100,E * 100);

			return 0;
	}


}

