package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int i;
		int x;
		double A;
		double B;
		double C;
		double D;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		for (i = 1;i <= n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 x = Integer.parseInt(tempVar2);
		 }
		 if (x <= 18)
		 {
			 a++;
		 }
		 else if (x >= 19 && x <= 35)
		 {
			 b++;
		 }
		 else if (x >= 36 && x <= 60)
		 {
			 c++;
		 }
		 else
		 {
			 d++;
		 }
		}
		A = 100.0 * a / n;
		B = 100.0 * b / n;
		C = 100.0 * c / n;
		D = 100.0 * d / n;
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("Over60: %.2lf%%\n",D);
		return 0;
	}



}

