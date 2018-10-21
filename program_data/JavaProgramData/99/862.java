package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] yer = new int[100];
		double q;
		double w;
		double e;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
	for (i = 0;i < m;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(yer[i]) = Integer.parseInt(tempVar2);
			}
	}
	 for (i = 0 ;i < m;i++)
	 {
		 if (yer[i] <= 18)
		 {
			 a += 1;
		 }
		 else if (19 <= yer[i] != 0 && yer[i] <= 35)
		 {
			 b += 1;
		 }
		 else if (36 <= yer[i] != 0 && yer[i] <= 60)
		 {
			 c += 1;
		 }
			 else
			 {
				 d += 1;
			 }
	 }
				q = 100.0 * a / m;
				w = 100.0 * b / m;
				e = 100.0 * c / m;
				r = 100.0 * d / m;
			System.out.printf("1-18: %.2lf%%\n",q);
			System.out.printf("19-35: %.2lf%%\n",w);
			System.out.printf("36-60: %.2lf%%\n",e);
			System.out.printf("60??: %.2lf%%\n",r);
	return 0;
	}

}

