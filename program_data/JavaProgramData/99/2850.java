package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[N];
	   for (i = 0;i < n;i++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	   }
	   int b;
	   int c;
	   int d;
	   int e;
	   b = 0;
	   c = 0;
	   d = 0;
	   e = 0;
	   for (i = 0;i < n;i++)
	   {
		 if (a[i] <= 18)
		 {
			  b++;
		 }
		 else if (a[i] >= 19 && a[i] <= 35)
		 {
			  c++;
		 }
		 else if (a[i] >= 36 && a[i] <= 60)
		 {
			  d++;
		 }
		 else
		 {
			  e++;
		 }
	   }
	   double b1;
	   double c1;
	   double d1;
	   double e1;
	 b1 = (double)b / n * 100;
	 c1 = (double)c / n * 100;
	 d1 = (double)d / n * 100;
	 e1 = (double)e / n * 100;
	   System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",b1,c1,d1,e1);
	   return 0;
	}
}

