package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int sum = 0;
		int y;
		double q = 0;
		double w = 0;
		double e = 0;
		double r = 0;
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
				y = Integer.parseInt(tempVar2);
			}
			if ((y >= 1) && (y <= 18))
			{
				a += 1;
			}
			else if ((y >= 19) && (y <= 35))
			{
				b += 1;
			}
			else if ((y >= 36) && (y <= 60))
			{
				c += 1;
			}
			else if (y > 60)
			{
				d += 1;
			}
		   sum = a + b + c + d;
		   q = (double)a / sum * 100;
		   w = (double)b / sum * 100;
		   e = (double)c / sum * 100;
		   r = (double)d / sum * 100;
		}


		System.out.printf("1-18: %.2lf%%\n",q);
		System.out.printf("19-35: %.2lf%%\n",w);
		System.out.printf("36-60: %.2lf%%\n",e);
		System.out.printf("60??: %.2lf%%\n",r);
		return 0;




	}

}

