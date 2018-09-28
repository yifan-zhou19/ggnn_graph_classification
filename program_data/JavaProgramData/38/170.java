package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static double[] x = new double[100];
	public static double eq;
	public static double s;
	public static void Main()
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  eq = 0.0,s = 0.0;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (j = 0;j < m;j++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   x + j = tempVar3;
		   }
	   eq = eq + x[j];
	   }
	   eq = (eq / m) * 1.0;
	   for (j = 0;j < m;j++)
	   {
		   s = s + (x[j] - eq) * (x[j] - eq);
	   }
	   s = Math.sqrt((s / m) * 1.0);
	   System.out.printf("%.5f\n", s);
	  }
	}
}

