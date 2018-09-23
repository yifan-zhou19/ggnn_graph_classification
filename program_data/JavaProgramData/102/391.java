package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j = 0;
	   int y = 0;
	   int t;
	   double s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String c = new String(new char[n]);
	   double[] a = new double[n];
	   double[] b = new double[n];
	   for (i = 0;i < n;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 c = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 s = Double.parseDouble(tempVar3);
		 }
		 t = c.length();
		 if (t == 4)
		 {
			 a[j] = s;
		 j++;
		 }
		 else
		 {
			 b[y] = s;
		 y++;
		 }
	   }

	   for (i = 0;i < j;i++)
	   {
		for (t = 0;t < j - 1 - i;t++)
		{
		if (a[t] > a[t + 1])
		{
			   double e = a[t];
		   a[t] = a[t + 1];
		   a[t + 1] = e;
		}
		}
	   }
	   for (i = 0;i < y;i++)
	   {
		for (t = 0;t < y - 1 - i;t++)
		{
		   if (b[t] < b[t + 1])
		   {
			  double e = b[t];
		   b[t] = b[t + 1];
		   b[t + 1] = e;
		   }
		}
	   }
	   for (i = 0;i < j;i++)
	   {
		   System.out.printf("%.2lf ",a[i]);
	   }
		for (i = 0;i < y;i++)
		{
		if (i == y - 1)
		{
		   System.out.printf("%.2lf",b[i]);
		}
	   else
	   {
		   System.out.printf("%.2lf ",b[i]);
	   }
		}

	System.in.read();
	System.in.read();
	System.in.read();
	}

}

