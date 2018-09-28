package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		double youerbili;
		double chengrenbili;
		double zhongnianbili;
		double laonianbili;
		int youer = 0;
		int chengren = 0;
		int zhongnian = 0;
		int laonian = 0;
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
				youer += 1;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				chengren += 1;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				zhongnian += 1;
			}
			else
			{
				laonian += 1;
			}
		}
		youerbili = (double)youer / (double)n * 100;
		chengrenbili = (double)chengren / (double)n * 100;
		zhongnianbili = (double)zhongnian / (double)n * 100;
		laonianbili = (double)laonian / (double)n * 100;
		System.out.printf("1-18: %.2lf%%\n",youerbili);
		System.out.printf("19-35: %.2lf%%\n",chengrenbili);
		System.out.printf("36-60: %.2lf%%\n",zhongnianbili);
		System.out.printf("60??: %.2lf%%\n",laonianbili);
		return 0;
	}
}

