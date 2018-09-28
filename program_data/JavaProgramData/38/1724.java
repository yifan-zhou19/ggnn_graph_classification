package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p,a=0,s=0,sum=0;
	double p;
	double a = 0;
	double s = 0;
	double sum = 0;
	double[] x = new double[1000];
	p = x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (j = 0;j < n;j++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  p + j = Double.parseDouble(tempVar3);
		  }
	   }
	   for (j = 0;j < n;j++)
	   {
		  a += *(p + j);
	   }
	   a = a / n;
	   for (j = 0;j < n;j++)
	   {
		  sum += Math.pow((*(p + j) - a),2);
	   }
	   s = Math.sqrt(sum / n);
	   System.out.printf("%.5lf\n",s);
	   a = 0;
	   s = 0;
	   sum = 0;
	}
	return 0;
	}

}

