package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int i;
	   int j;
	   int[] gs = new int[K];
	   double[] sz = new double[N];
	   double sum = 0;
	   double a;
	   double s;
	   double fch = 0;
	   double[] xb = new double[N];
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
			  gs[i] = Integer.parseInt(tempVar2);
		  }
		  for (j = 0;j < gs[i];j++)
		  {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 sz[j] = Double.parseDouble(tempVar3);
			 }
			 sum += sz[j];
		  }
		  a = sum / gs[i];
		  for (j = 0;j < gs[i];j++)
		  {
			 xb[j] = (sz[j] - a) * (sz[j] - a);
			 fch += xb[j];
		  }
		  s = Math.sqrt(fch / gs[i]);
		  System.out.printf("%.5lf\n",s);
		  sum = 0;
		  fch = 0;
	   }
	   return 0;
	}
}

