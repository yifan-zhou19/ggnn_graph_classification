package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double yi = 0;
		double er = 0;
		double san = 0;
		double si = 0;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
			yi++;
			}
			else if (a[i] <= 35)
			{
			er++;
			}
			else if (a[i] <= 60)
			{
			san++;
			}
			else if (a[i] >= 60)
			{
			si++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",yi / n * 100);
		System.out.printf("19-35: %.2lf%%\n",er / n * 100);
		System.out.printf("36-60: %.2lf%%\n",san / n * 100);
		System.out.printf("60??: %.2lf%%\n",si / n * 100);
		return 0;
	}
}

