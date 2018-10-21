package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   int i;
		   int j;
		   float[] x = new float[50];
		   float[] y = new float[50];
		   float a;
		   float b;
		   double max = 0;
		   double m;
		   double k;
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
			   x[i] = Float.parseFloat(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   y[i] = Float.parseFloat(tempVar3);
		   }
		   }
		   for (i = 0;i < n - 1;i++)
		   {
		   for (j = i + 1;j < n;j++)
		   {
				 a = (x[j] - x[i]) * (x[j] - x[i]);
			  b = (y[i] - y[j]) * (y[i] - y[j]);
			  k = (double)Math.sqrt(a + b);
			  if (k > max)
			  {
			  max = k;
			  }
		   }
		   }
		  System.out.printf("%4.4f",max);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

