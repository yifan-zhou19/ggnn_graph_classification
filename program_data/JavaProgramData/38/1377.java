package <missing>;

public class GlobalMembers
{
	public static double fangcha(int n, double[] p)
	{
		   double a = 0;
		   double s = 0;
		   int i;

		   for (i = 0;i < n;i++)
		   {
		   a = a + p[i];
		   }

		   a = a / n;

		   for (i = 0;i < n;i++)
		   {
		   s = s + (p[i] - a) * (p[i] - a);
		   }

		   s = Math.sqrt(s / n);

		   return (s);
	}





	public static int Main()
	{
		  int k;
		  int n;
		  int i;
		  int j;
		  double[] num = new double[100];
		  double result;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		  double p;
		  p = num;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (j = 1;j <= k;j++)
		  {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   n = Integer.parseInt(tempVar2);
			   }
			   for (i = 0;i < n;i++)
			   {
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						num[i] = Double.parseDouble(tempVar3);
					}
			   }
			   result = fangcha(n, p);
			   System.out.printf("%.5lf\n",result);
		  }

	}


}

