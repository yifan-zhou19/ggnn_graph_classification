package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 double n;
	 double q = 0;
	 double max;
	 double[] a = new double[301];
	 double[] b = new double[301];
	 double[] c = new double[3];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Double.parseDouble(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Double.parseDouble(tempVar2);
	  }
	  q = q + a[i];
	 }
	 q = q / n;
	 for (i = 0;i < n;i++)
	 {
	  b[i] = Math.abs(a[i] - q);
	 }
	 max = b[0];
	 c[0] = a[0];
	 for (i = 1;i < n;i++)
	 {
	  if (b[i] > max)
	  {
	   max = b[i];
	   c[0] = a[i];
	  }
	 }

	 for (i = 1;i < n;i++)
	 {
	  if (b[i] == max && a[i] != c[0])
	  {
		  c[1] = a[i];
	  break;
	  }
	 }
	  if (c[1] == 0)
	  {
	  System.out.printf("%1.lf\n",c[0]);
	  }
	 else
	 {
	  if (c[0] > c[1])
	  {
	  System.out.printf("%1.lf,%1.lf",c[1],c[0]);
	  }
	  else
	  {
		  System.out.printf("%1.lf,%1.lf",c[0],c[1]);
	  }
	 }

	 return 0;
	}






}

