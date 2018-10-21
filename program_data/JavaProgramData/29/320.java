package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int[] c = new int[100000];
	 double sum;
	 double[] a = new double[10000];
	 double[] b = new double[100000];
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
		  c[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 a[0] = 1;
	 a[1] = 1;
	 for (j = 0;j < n;j++)
	 {
	  for (i = 2;i < c[j] + 2;i++)
	  {
	   a[i] = a[i - 2] + a[i - 1];
	  }
	  for (i = 0;i < c[j];i++)
	  {
	   b[i] = a[i + 2] / a[i + 1];
	  }
	  sum = 0;
	  for (i = 0;i < c[j];i++)
	  {
	   sum = sum + b[i];
	  }
	  System.out.printf("%.3lf\n",sum);
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

