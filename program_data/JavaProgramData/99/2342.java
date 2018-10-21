package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] sz = new int[100];
	   int i;
	   double s1 = 0;
	   double s2 = 0;
	   double s3 = 0;
	   double s4 = 0;
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
		 if (sz[i] <= 18)
		 {
		   s1++;
		 }
		 if (sz[i] > 18 && sz[i] <= 35)
		 {
		   s2++;
		 }
		 if (sz[i] > 35 && sz[i] <= 60)
		 {
		   s3++;
		 }
		 if (sz[i] > 60)
		 {
		   s4++;
		 }
	   }
		   s1 = 1.0 * 100 * s1 / n;
		   s2 = 1.0 * 100 * s2 / n;
		   s3 = 1.0 * 100 * s3 / n;
		   s4 = 1.0 * 100 * s4 / n;
	  System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",s1,s2,s3,s4);
	return 0;
	}

}

