package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   double[] c = new double[1000];
	   double[] d = new double[1000];
	   int n;
	   int i;
	   int x = 0;
	   double y = 0.00;
	   double z;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   for (i = 0;i < n;i = i + 1)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
		   }
		   for (i = 0;i < n;i = i + 1)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b[i] = Integer.parseInt(tempVar3);
			   }
		   }
		   for (i = 0;i < n;i = i + 1)
		   {
			  if (b[i] >= 90 && b[i] <= 100)
			  {
				  c[i] = 4.0;
			  }
			  else if (b[i] >= 85 && b[i] <= 89)
			  {
				  c[i] = 3.7;
			  }
			  else if (b[i] >= 82 && b[i] <= 84)
			  {
				  c[i] = 3.3;
			  }
			  else if (b[i] >= 78 && b[i] <= 81)
			  {
				  c[i] = 3.0;
			  }
			  else if (b[i] >= 75 && b[i] <= 77)
			  {
				  c[i] = 2.7;
			  }
			  else if (b[i] >= 72 && b[i] <= 74)
			  {
				  c[i] = 2.3;
			  }
			  else if (b[i] >= 68 && b[i] <= 71)
			  {
				  c[i] = 2.0;
			  }
			  else if (b[i] >= 64 && b[i] <= 67)
			  {
				  c[i] = 1.5;
			  }
			  else if (b[i] >= 60 && b[i] <= 63)
			  {
				  c[i] = 1.0;
			  }
			  else if (b[i] < 60)
			  {
				  c[i] = 0.0;
			  }
		   }
		   for (i = 0;i < n;i = i + 1)
		   {
			   d[i] = a[i] * c[i];
		   }
		   for (i = 0;i < n;i = i + 1)
		   {
			   x = x + a[i];
			   y = y + d[i];
		   }
		   z = (y * 1.00) / (x * 1.00);
		   System.out.printf("%.2lf",z);
	return 0;
	}


}

