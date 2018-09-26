package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int i;
		int a;
		double m;
		double l;
		double p;
		double q;
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
					s1 = s1 + 1;
				}
				else if (a >= 19 && a <= 35)
				{
					s2 = s2 + 1;
				}
				else if (a >= 36 && a <= 60)
				{
					s3 = s3 + 1;
				}
				else
				{
					s4 = s4 + 1;
				}
			}
			m = (double)s1 / n * 100;
			l = (double)s2 / n * 100;
			p = (double)s3 / n * 100;
			q = (double)s4 / n * 100;
			System.out.print("1-18: ");
			System.out.printf("%.2lf%\n",m);
			System.out.print("19-35: ");
			System.out.printf("%.2lf%\n",l);
			System.out.print("36-60: ");
			System.out.printf("%.2lf%\n",p);
			System.out.print("60??: ");
			System.out.printf("%.2lf%\n",q);

				return 0;
	}

}

