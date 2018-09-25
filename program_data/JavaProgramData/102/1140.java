package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j = 0;
	   int k = 0;
	   int m = 0;
	   int t;
	   int q;
	   int u;
	   String e = new String(new char[50]);
	   double[] r = new double[50];
	   double[] a = new double[50];
	   double[] b = new double[50];
	   double g;
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
			   e = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   r[i] = Double.parseDouble(tempVar3);
		   }
		   if (e.charAt(0) == 'm')
		   {
					a[j] = r[i];
					j++;
		   }
		   else
		   {
						b[k] = r[i];
						k++;
		   };
	   }
		for (t = 0;t < j;t++)
		{
		   q = t;
		   for (u = t + 1;u < j;u++)
		   {
			   if (a[u] < a[q])
			   {
				   q = u;
			   };
		   }
		  if (q != t)
		  {
			  g = a[q];
			  a[q] = a[t];
			  a[t] = g;
		  };
		}
		t = 0;
		q = 0;
		u = 0;
		g = 0;
		for (t = 0;t < k;t++)
		{
		   q = t;
		   for (u = t + 1;u < k;u++)
		   {
			   if (b[u] > b[q])
			   {
				   q = u;
			   };
		   }
		  if (q != t)
		  {
			  g = b[q];
			  b[q] = b[t];
			  b[t] = g;
		  };
		}
		for (i = 0;i < j;i++)
		{
			 System.out.printf("%.2lf ",a[i]);
		}
		 for (i = 0;i < k - 1;i++)
		 {
			 System.out.printf("%.2lf ",b[i]);
		 }
		 System.out.printf("%.2lf",b[k - 1]);

		 return 0;
	}

}

