package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int k;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double e;
		double f;
		double g;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 k = Integer.parseInt(tempVar2);
			 }
			 if (k <= 18 && k>0)
			 {
			 a += 1;
			 i++;
			 }
			 else if (k > 18 && k <= 35)
			 {
			 b += 1;
			 i++;
			 }
			 else if (k > 35 && k <= 60)
			 {
			 c += 1;
			 i++;
			 }
			 else
			 {
			 d += 1;
			 i++;
			 }
		}
			 e = 100.0 * a / n;
			 f = 100.0 * b / n;
			 g = 100.0 * c / n;
			 h = 100.0 * d / n;
			 System.out.printf("1-18: %.2lf%%\n",e);
			 System.out.printf("19-35: %.2lf%%\n",f);
			 System.out.printf("36-60: %.2lf%%\n",g);
			 System.out.printf("60??: %.2lf%%\n",h);
			 return 0;
	}
}

