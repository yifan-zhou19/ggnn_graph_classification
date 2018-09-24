package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int s;
	   int a;
	   int b;
	   int e;
	   int h;
		 a = 0;
		 b = 0;
		 e = 0;
		 h = 0;
	   double m;
	   double c;
	   double n;
	   double[] x = new double[100];
	   double[] y = new double[100];
	   char[][] z = new char[100][10];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < s;i++)
	   {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Double.parseDouble(tempVar3);
			}
		   if (strcmp(z[i],"male") == 0)
		   {
				x[e] = m;
				a++;
				e++;
		   }
			else
			{
				y[h] = m;
				 b++;
				 h++;
			}
	   }
		   for (i = a;i > 0;i--)
		   {
			for (j = 0;j < i - 1;j++)
			{
			   if (x[j] > x[j + 1])
			   {
					  c = x[j];
					x[j] = x[j + 1];
					x[j + 1] = c;
			   }
			}
		   }
			for (i = b;i > 0;i--)
			{
			for (j = 0;j < i - 1;j++)
			{
			   if (y[j] < y[j + 1])
			   {
					  c = y[j];
					y[j] = y[j + 1];
					y[j + 1] = c;
			   }
			}
			}
			  for (i = 0;i < a;i++)
			  {
				System.out.printf("%.2lf ",x[i]);
			  }
			  for (i = 0;i < b;i++)
			  {
				   if (i != b - 1)
				   {
					   System.out.printf("%.2lf ",y[i]);
				   }
				 else
				 {
					 System.out.printf("%.2f",y[i]);
				 }
			  }
		   return 0;
	}
}

