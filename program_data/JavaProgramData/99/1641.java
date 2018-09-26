package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int a = 0;
	   int b = 0;
	   int c = 0;
	   int d = 0;
	   double e;
	   double f;
	   double g;
	   double h;
	   double m;
	   double j;
	   double k;
	   double l;
	   double[] age = new double[100];
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
		   age[i] = Double.parseDouble(tempVar2);
	   }
	   if (age[i] <= 18)
	   {
		   a += 1;
	   }
	   if (age[i] >= 19 && age[i] <= 35)
	   {
		   b += 1;
	   }
	   if (age[i] >= 36 && age[i] <= 60)
	   {
		   c += 1;
	   }
	   else if (age[i] >= 61)
	   {
		   d += 1;
	   }
	   e = (double)a / n;
	   f = (double)b / n;
	   g = (double)c / n;
	   h = (double)d / n;
	   m = 100 * e;
	   j = 100 * f;
	   k = 100 * g;
	   l = 100 * h;
	   }
	   System.out.printf("1-18: %.2lf%\n",m);
	   System.out.printf("19-35: %.2lf%\n",j);
	   System.out.printf("36-60: %.2lf%\n",k);
	   System.out.printf("60??: %.2lf%\n",l);
	   return 0;
	}

}

