package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int c;
		int d;
		double A;
		double B;
		double C;
		double D;
		int[] sz = new int[100];
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
			 (sz[i]) = Integer.parseInt(tempVar2);
		 }
		}
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a++;
			}
			else if (sz[i] <= 35 && sz[i]>18)
			{
				b++;
			}
			else if (sz[i] <= 60 && sz[i]>35)
			{
				c++;
			}
			else if (sz[i] > 60)
			{
				d++;
			}
		}
		A = (double)(a * 1.0 / n * 100);
		B = (double)(b * 1.0 / n * 100);
		C = (double)(c * 1.0 / n * 100);
		D = (double)(d * 1.0 / n * 100);
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("Over60: %.2lf%%\n",D);
		return 0;
	}


}

