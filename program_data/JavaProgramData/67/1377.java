package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   double l;
	   double[] a = new double[100];
	   double[] b = new double[100];
	   double[] c = new double[100];
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
			   a[i] = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Double.parseDouble(tempVar3);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   c[i] = 1.0 * b[i] / a[i];
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		   l = c[i + 1] - c[0];
		   if (l > 0.05)
		   {
			   System.out.print("better\n");

		   }
		   else if (l < -0.05)
		   {
			   System.out.print("worse\n");
		   }
		   else
		   {
			   System.out.print("same\n");
		   }
	   }
	   return 0;
	}
}

