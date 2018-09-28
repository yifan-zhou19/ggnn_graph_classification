package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 System.out.print("\n");
	 int[] a = new int[n];
	 int[] b = new int[n];
	 double[] c = new double[n];
	 double sum = 0;
	 double x;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  s = s + a[i];
	 }
	 System.out.print("\n");
	 for (i = 0;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  if (b[i] > 89)
	  {
		  c[i] = 4.0;
	  }
	  else if (b[i] > 84)
	  {
		  c[i] = 3.7;
	  }
	  else if (b[i] > 81)
	  {
		  c[i] = 3.3;
	  }
	  else if (b[i] > 77)
	  {
		  c[i] = 3.0;
	  }
	  else if (b[i] > 74)
	  {
		  c[i] = 2.7;
	  }
	  else if (b[i] > 71)
	  {
		  c[i] = 2.3;
	  }
	  else if (b[i] > 67)
	  {
		  c[i] = 2.0;
	  }
	  else if (b[i] > 63)
	  {
		  c[i] = 1.5;
	  }
	  else if (b[i] > 59)
	  {
		  c[i] = 1.0;
	  }
	  else
	  {
		  c[i] = 0;
	  }
	  sum = sum + c[i] * a[i];
	 }
	  System.out.print("\n");
	  x = sum / s;
	  System.out.printf("%.2lf\n",x);
	  return 0;
	}


}

