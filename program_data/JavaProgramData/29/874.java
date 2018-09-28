package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] a = new int[100];
	   int j;
	   int[] c = new int[100];
	   int[] d = new int[100];
	   double[] b = new double[100];
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
	   b[i] = 0.0;
	   for (j = 0;j < a[i];j++)
	   {
	   if (j == 0)
	   {
	   d[0] = 2;
	   c[0] = 1;
	   }
	   if (j > 0)
	   {
	   d[j] = d[j - 1] + c[j - 1];
	   c[j] = d[j - 1];
	   }
	   b[i] += (double)d[j] / (double)c[j];
	   }
	   System.out.printf("%.3lf\n",b[i]);
	   }
	   return 0;
	}

}

