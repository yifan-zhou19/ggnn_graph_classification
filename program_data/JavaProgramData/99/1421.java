package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int a;
		double xiaob;
		double qingb;
		double zhongb;
		double laob;
		int xiao = 0;
		int qing = 0;
		int zhong = 0;
		int lao = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a >= 1 && a <= 18)
			{
				xiao++;
			}
			else if (a >= 19 && a <= 35)
			{
				qing++;
			}
			else if (a >= 36 && a <= 60)
			{
				zhong++;
			}
			else if (a >= 61)
			{
				lao++;
			}
		}
		xiaob = (double)xiao / n * 100;
		qingb = (double)qing / n * 100;
		zhongb = (double)zhong / n * 100;
		laob = (double)lao / n * 100;
		System.out.printf("1-18: %.2lf%%\n",xiaob);
		System.out.printf("19-35: %.2lf%%\n",qingb);
			 System.out.printf("36-60: %.2lf%%\n",zhongb);
		System.out.printf("60??: %.2lf%%\n",laob);
	}


}

