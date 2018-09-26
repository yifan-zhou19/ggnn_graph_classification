package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] nianling = new int[100];
		int n18;
		int sum18 = 0;
		int n19;
		int sum19 = 0;
		int n36;
		int sum36 = 0;
		int n61;
		int sum61 = 0;
		int i;
		double p18;
		double p19;
		double p36;
		double p61;
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
				nianling[i] = Integer.parseInt(tempVar2);
			}
			if (nianling[i] <= 18)
			{
				sum18 += 1;
			}
			if (nianling[i] >= 19 && nianling[i] <= 35)
			{
				sum19 += 1;
			}
			if (nianling[i] >= 36 && nianling[i] <= 60)
			{
				sum36 += 1;
			}
			if (nianling[i] >= 61)
			{
				sum61 += 1;
			}
		}
		p18 = (double)sum18 / (double)n * 100.0;
		p19 = (double)sum19 / (double)n * 100.0;
		p36 = (double)sum36 / (double)n * 100.0;
		p61 = (double)sum61 / (double)n * 100.0;
		System.out.printf("1-18: %.2lf%%\n",p18);
		System.out.printf("19-35: %.2lf%%\n",p19);
		System.out.printf("36-60: %.2lf%%\n",p36);
		System.out.printf("60??: %.2lf%%\n",p61);
		return 0;
	}



}

