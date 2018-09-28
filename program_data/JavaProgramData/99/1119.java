package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i;
		int a;
		int b;
		int c;
		int d;
		double rate1;
		double rate2;
		double rate3;
		double rate4;
		double k;
		double l;
		double m;
		double p;
		i = 1,a = 0,b = 0,c = 0,d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 0 && n <= 100)
		{
			while (i <= n)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				i = i + 1;
				if (x <= 18)
				{
					a++;
				}
				else if (x > 18 && x <= 35)
				{
					b++;
				}
				else if (x > 35 && x <= 60)
				{
					c++;
				}
				else
				{
					d++;
				}
			}
			k = a,l = b,m = c,p = d;
			rate1 = 100 * k / n,rate2 = 100 * l / n,rate3 = 100 * m / n,rate4 = 100 * p / n;
			System.out.printf("1-18: %.2lf%%\n",rate1);
			System.out.printf("19-35: %.2lf%%\n",rate2);
			System.out.printf("36-60: %.2lf%%\n",rate3);
			System.out.printf("60??: %.2lf%%\n",rate4);
		}
		return 0;
	}

}

