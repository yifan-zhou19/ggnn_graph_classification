package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int[] sz = new int[1000];
	 double sum;
	 double e;
	 double f;
	 double d;
	 double[] jieguo = new double[1000];
	 int a;
	 int b;
	 int c;
	 int g;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (a = 0;a < m;a++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sz[a] = Integer.parseInt(tempVar2);
	  }
	 }
	 for (b = 0;b < m;b++)
	 {
	  sum = 0.0;
	  d = 2.0;
	  e = 1.0;
	  f = 0.0;
	  for (c = 0;c < sz[b];c++)
	  {
		d += f;
		sum += (d / e);
		f = e;
		e = d;
	  }
	  jieguo[b] = sum;
	 }
	 for (g = 0;g < m - 1;g++)
	 {
	  System.out.printf("%.3lf\n",jieguo[g]);
	 }
	 System.out.printf("%.3lf",jieguo[m - 1]);
	 return 0;
	}
}

