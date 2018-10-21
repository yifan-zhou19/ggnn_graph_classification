package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] old = new int[9999];
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
				old[i] = Integer.parseInt(tempVar2);
			}
		}
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		for (i = 0;i < n;i++)
		{
			if (old[i] > 60)
			{
				four = four + 1;
			}
			else if (old[i] > 35)
			{
				three = three+1;
			}
			else if (old[i] > 18)
			{
				two = two + 1;
			}
			else
			{
				one = one+1;
			}
		}
		double onelv;
		double twolv;
		double threelv;
		double fourlv;
		onelv = (double)one / n * 100;
		twolv = (double)two / n * 100;
		threelv = (double)three / n * 100;
		fourlv = (double)four / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",onelv,twolv,threelv,fourlv);
		return 0;
	}


}

