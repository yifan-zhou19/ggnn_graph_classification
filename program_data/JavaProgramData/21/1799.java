package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i = 0;
	   int sum = 0;
	   int t;
	   int j;
	   double max = 0;
	   double aver;
	   int[] a = new int[300];
	   double[] b = new double[300];
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
		   sum = sum + a[i];
	   }
	   aver = (double)sum / n;


	   for (i = 0;i < n;i++)
	   {
		   b[i] = Math.abs((a[i] - aver));
		   if (b[i] >= max)
		   {
			   max = b[i];
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (b[i] == max)
		   {
			   System.out.printf("%d",a[i]);
			   t = i;
			   break;
		   }
	   }
	   for (i = t + 1;i < n;i++)
	   {
		   if (b[i] == max)
		   {
			   System.out.printf(",%d",a[i]);
		   }
	   }
	   return 0;
	}
}

