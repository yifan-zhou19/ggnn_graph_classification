package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int s1 = 0;
	   int s2 = 0;
	   int s3 = 0;
	   int s4;
	   int[] sz = new int[100];
	   double p1;
	   double p2;
	   double p3;
	   double p4;
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
		 if (sz[i] <= 18)
		 {
		   s1++;
		 }
		 if (sz[i] >= 19 && sz[i] <= 35)
		 {
		   s2++;
		 }
		 if (sz[i] >= 36 && sz[i] <= 60)
		 {
		   s3++;
		 }
	   }
		s4 = n - s1 - s2 - s3;
	   p1 = (double)100 * s1 / n;
	   p2 = (double)100 * s2 / n;
	   p3 = (double)100 * s3 / n;
	   p4 = (double)(100 * s4) / n;
	  System.out.printf("1-18: %.2lf%%\n",p1);
	  System.out.printf("19-35: %.2lf%%\n",p2);
	  System.out.printf("36-60: %.2lf%%\n",p3);
	  System.out.printf("60??: %.2lf%%",p4);
	 return 0;
	}
}

