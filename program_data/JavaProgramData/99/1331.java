package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   double m1;
	   double m2;
	   double m3;
	   double m4;
	   double s1 = 0;
	   double s2 = 0;
	   double s3 = 0;
	   double s4 = 0;
	   double[] a = new double[200];
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
			   a[i] = Double.parseDouble(tempVar2);
		   }
		   if (a[i] <= 18)
		   {
			  s1 += 1;
		   }
		   if (a[i] >= 19 && a[i] <= 35)
		   {
			  s2 += 1;
		   }
		   if (a[i] >= 36 && a[i] <= 60)
		   {
			  s3 += 1;
		   }
		   if (a[i] >= 61)
		   {
			   s4 += 1;
		   }
	   }
	   m1 = s1 / n * 100;
	   m2 = s2 / n * 100;
	   m3 = s3 / n * 100;
	   m4 = s4 / n * 100;
	   System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",m1,m2,m3,m4);
	   return 0;
	}

}

