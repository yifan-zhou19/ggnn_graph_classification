package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   double[] a = new double[100];
	   double[] b = new double[100];
	   double max = 0;
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
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Double.parseDouble(tempVar3);
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (j = i + 1;j < n;j++)
		  {
			 if ((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) > max)
			 {
				 max = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]);
			 }
		  }
	   }
	   max = Math.sqrt(max);
	   System.out.printf("%.4f\n",max);
	}
}

