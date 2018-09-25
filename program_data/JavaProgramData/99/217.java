package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] sz = new int[120];
	   int[] sz1 = new int[10];
	   double a;
	   double b;
	   double c;
	   double d;
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
			   sz[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (sz[i] >= 1 && sz[i] <= 18)
		   {
			   sz1[0]++;
		   }
		   else if (sz[i] >= 19 && sz[i] <= 35)
		   {
				sz1[1]++;
		   }
		   else if (sz[i] >= 36 && sz[i] <= 60)
		   {
				sz1[2]++;
		   }
		   else
		   {
				sz1[3]++;
		   }
	   }
		a = (double)sz1[0] * 100 / n;
		b = (double)sz1[1] * 100 / n;
		c = (double)sz1[2] * 100 / n;
		d = (double)sz1[3] * 100 / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}
}

