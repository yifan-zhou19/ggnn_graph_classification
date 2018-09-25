package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double e = 0;
		double f = 0;
		double g = 0;
		double h = 0;
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
				e++;
			}
			else if (a[i] <= 35)
			{
				f++;
			}
			else if (a[i] <= 60)
			{
				g++;
			}
			else
			{
				h++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",(100 * e) / n,(100 * f) / n,(100 * g) / n,(100 * h) / n);
		return 0;
	}
}

