package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int[] a = new int[1000];
	 double[] b = {0.0, 0, 0, 0};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   if (a[i] >= 1 && a[i] <= 18)
	   {
		 b[0]++;
	   }
	   if (a[i] >= 19 && a[i] <= 35)
	   {
		 b[1]++;
	   }
	   if (a[i] >= 36 && a[i] <= 60)
	   {
		 b[2]++;
	   }
	   if (a[i] >= 61)
	   {
		 b[3]++;
	   }
	 }
	 System.out.printf("1-18: %.2lf%%\n",b[0] * 100 / n);
	 System.out.printf("19-35: %.2lf%%\n",b[1] * 100 / n);
	 System.out.printf("36-60: %.2lf%%\n",b[2] * 100 / n);
	 System.out.printf("60??: %.2lf%%\n",b[3] * 100 / n);
	}

}

