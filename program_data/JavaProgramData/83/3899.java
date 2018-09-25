package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 double[] a = new double[11];
	 double[] b = new double[11];
	 double s;
	 double m;
	 double f;
	 int n;
	 int i;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	  m = 0;
	 for (j = 1;j <= n;j++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b[j] = Double.parseDouble(tempVar2);
		 }
	   m = m + b[j];
	 }
	 for (i = 1;i <= n;i++)
	 {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Double.parseDouble(tempVar3);
	   }
	   if (a[i] >= 60)
	   {
		if ((a[i] >= 90) && (a[i] <= 100))
		{
			a[i] = 4.0;
		}
		if ((a[i] >= 85) && (a[i] <= 90))
		{
			a[i] = 3.7;
		}
		if ((a[i] >= 82) && (a[i] <= 84))
		{
			a[i] = 3.3;
		}
		if ((a[i] >= 78) && (a[i] <= 81))
		{
			a[i] = 3.0;
		}
		if ((a[i] >= 75) && (a[i] <= 77))
		{
			a[i] = 2.7;
		}
		if ((a[i] >= 72) && (a[i] <= 74))
		{
			a[i] = 2.3;
		}
		if ((a[i] >= 68) && (a[i] <= 71))
		{
			a[i] = 2.0;
		}
		if ((a[i] >= 64) && (a[i] <= 67))
		{
			a[i] = 1.5;
		}
		if ((a[i] >= 60) && (a[i] <= 63))
		{
			a[i] = 1.0;
		}
	   }
	   else
	   {
		 a[i] = 0;
	   }
	 }
	  s = 0;
	  for (k = 1;k <= n;k++)
	  {
			  s = s + a[k] * b[k];
	  }
	  f = s / m;
	 System.out.printf("%.2lf",f);
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 n = Integer.parseInt(tempVar4);
	 }
	 return 0;
	 }

}

