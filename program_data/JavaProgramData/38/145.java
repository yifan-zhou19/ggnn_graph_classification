package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= k;i++)
	 {
	   double a = 0.0;
	   double[] x = new double[200];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   double * px;
	   double s1 = 0.0;
	   double s = 0.0;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (j = 0;j < n;j++)
	   {
		 x[j] = 0.0;
	   }
	   px = x;
	   for (j = 0;j < n;j++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  px = Double.parseDouble(tempVar3);
		  }
		  a += *px / n;
		  px++;
	   }
	   px = x;
	   for (j = 0;j < n;j++)
	   {
		  s1 += (*px - a) * (*px - a) / n;
		  px++;
	   }
	   s = Math.sqrt(s1);
	   System.out.printf("%.5lf\n",s);
	 }
	 return 0;
	}

}

