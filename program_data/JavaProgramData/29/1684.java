package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int i;
	   int[] a = new int[100];
	   double sum = 0;
	   a[1] = 1;
	   a[2] = 2;
	   for (i = 3;i <= 100;i++)
	   {
		   a[i] = a[i - 1] + a[i - 2];
	   }
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   while (m > 0)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   for (i = 1;i <= n;i++)
		   {
			   sum += (double)a[i + 1] / a[i];
		   }
		   System.out.printf("%.3lf\n",sum);
		   sum = 0;
		   m--;
	   }
	   return 0;
	}

}

