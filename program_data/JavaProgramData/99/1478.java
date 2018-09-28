package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[100];
	   int[] s = new int[4];
	   int i;
	   double[] c = new double[4];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   if (a[i] >= 1 && a[i] <= 18)
	   {
		   s[1] += 1;
	   }
	   else if (a[i] >= 19 && a[i] <= 35)
	   {
		   s[2] += 1;
	   }
	   else if (a[i] >= 36 && a[i] <= 60)
	   {
		   s[3] += 1;
	   }
	   else if (a[i] >= 60)
	   {
		   s[4] += 1;
	   }
	   }
	   for (i = 1;i <= 3;i++)
	   {
		   c[i] = (double)s[i] / n;
	   }
	   c[4] = 1.000000 - c[1] - c[2] - c[3];
	   System.out.printf("1-18: %.2lf%%\n",c[1] * 100);
	   System.out.printf("19-35: %.2lf%%\n",c[2] * 100);
	   System.out.printf("36-60: %.2lf%%\n",c[3] * 100);
	   System.out.printf("60??: %.2lf%%\n",c[4] * 100);
	   return 0;
	}

}

