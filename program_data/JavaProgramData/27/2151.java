package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   double s;
	   double c;
	   double d;
	   double e;
	   float t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   float[][] a = new float[n][3];
	   for (i = 0;i <= (n - 1);i++)
	   {
		 for (j = 0;j <= 2;j++)
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   t = Float.parseFloat(tempVar2);
		   }
		   a[i][j] = t;
		 }
	   }
	   for (i = 0;i <= (n - 1);i++)
	   {
		 s = a[i][1] * a[i][1] - 4 * a[i][0] * a[i][2];
		 if (s > 1e-6)
		 {
		 c = (-a[i][1] + Math.sqrt(s)) / (2 * a[i][0]);
		 d = (-a[i][1] - Math.sqrt(s)) / (2 * a[i][0]);
		 if (Math.abs(c) < 1e-6)
		 {
			 c = 0.00000;
		 }
		 if (Math.abs(d) < 1e-6)
		 {
			 c = 0.00000;
		 }
		 System.out.printf("x1=%0.5f;x2=%0.5f\n",c,d);
		 }
		 else if (Math.abs(s) < 1e-6)
		 {
		   c = -a[i][1] / (2 * a[i][0]);
		   if (Math.abs(c) < 1e-6)
		   {
			   c = 0.00000;
		   }
		   System.out.printf("x1=x2=%.5f\n",c);
		 }
		 else
		 {
		   c = Math.sqrt(-s) / (2 * a[i][0]);
		   if (Math.abs(a[i][1]) > 1e-6)
		   {
			   d = -a[i][1] / (2 * a[i][0]);
		   }
		   else
		   {
			   d = 0.00000;
		   }
		   if (c < 1e-6)
		   {
			   System.out.printf("x1=%.5f%.5fi;x2=%.5f+%.5fi\n",d,c,d,-c);
		   }
		   else
		   {
			   System.out.printf("x1=%.5f+%.5fi;x2=%.5f%.5fi\n",d,c,d,-c);
		   }
		 }
	   }
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}



}

