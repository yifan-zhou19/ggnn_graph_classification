package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				f = Integer.parseInt(tempVar2);
			}
			if (f <= 18)
			{
				a++;
			}
			else if (f >= 19 && f <= 35)
			{
				b++;
			}
			else if (f >= 36 && f <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
	   double A;
	   double B;
	   double C;
	   double D;
	   A = 100.00 * a / n;
	   B = 100.00 * b / n;
	   C = 100.00 * c / n;
	   D = 100.00 * d / n;
	   System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%\n",A,B,C,D);
	   return 0;
	}

}

