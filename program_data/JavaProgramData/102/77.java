package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int p = 0;
	   int q = 0;
	   double[] m = new double[50];
	   double[] w = new double[50];
	   double e;
	   String s = new String(new char[50]);
	   final String b = "male";
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
			   s = tempVar2.charAt(0);
		   }
		   if (strcmp(s,b) != 0)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   w[p] = Double.parseDouble(tempVar3);
			   }
			   p++;
		   }
		   else
		   {
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   m[q] = Double.parseDouble(tempVar4);
			   }
			   q++;
		   }
	   }
	   for (i = 1;i <= q;i++)
	   {
		   for (j = 0;j < q - i;j++)
		   {
			   if (m[j] > m[j + 1])
			   {
				   e = m[j];
				   m[j] = m[j + 1];
				   m[j + 1] = e;
			   }
		   }
	   }
	   for (i = 0;i < q;i++)
	   {
		   if (i == 0)
		   {
		   System.out.printf("%.2lf",m[i]);
		   }
		   else
		   {
				 System.out.printf(" %.2lf",m[i]);
		   }

	   }

	   for (i = 1;i <= p;i++)
	   {
		   for (j = 0;j < p - i;j++)
		   {
			   if (w[j] > w[j + 1])
			   {
				   e = w[j];
				   w[j] = w[j + 1];
				   w[j + 1] = e;
			   }
		   }
	   }
	   for (i = p - 1;i >= 0;i--)
	   {
		   System.out.printf(" %.2lf",w[i]);
	   }
	   return 0;
	}





}

