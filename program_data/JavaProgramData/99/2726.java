package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (a[i] <= 18)
		   {
		  s1 = s1 + 1;
		   }
	   else if (a[i] >= 19 && a[i] <= 35)
	   {
		   s2 = s2 + 1;
	   }
	   else if (a[i] >= 36 && a[i] <= 60)
	   {
		   s3 = s3 + 1;
	   }
	   else
	   {
		   s4 = s4 + 1;
	   }
	   }
	   System.out.printf("1-18: %.2lf%%\n",s1 / n * 100);
	   System.out.printf("19-35: %.2lf%%\n",s2 / n * 100);
	   System.out.printf("36-60: %.2lf%%\n",s3 / n * 100);
	   System.out.printf("60??: %.2lf%%\n",s4 / n * 100);


		return 0;
	}

}

