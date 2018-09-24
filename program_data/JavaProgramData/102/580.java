package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String c = new String(new char[10]);
		 double[] b = new double[40];
		 double[] a = new double[40];
		 double e;
		 double h;
		   int n;
		   int i;
		   int t;
		   int d;
		   int s;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 t = 0;
		 d = 0;
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
				 h = Double.parseDouble(tempVar3);
			 }
			 if (c.charAt(0) == 'm')
			 {
				 a[t] = h;
				 t++;
			 }
			 if (c.charAt(0) == 'f')
			 {
				 b[d] = h;
				 d++;
			 }
		 }
		 for (i = 0;i < t;i++)
		 {
			 for (s = i + 1;s < t;s++)
			 {
				 if (a[i] > a[s])
				 {
					 e = a[i];
					 a[i] = a[s];
					 a[s] = e;
				 }
			 }
		 }
		 for (i = 0;i < d;i++)
		 {
			 for (s = i + 1;s < d;s++)
			 {
				 if (b[i] < b[s])
				 {
					 e = b[i];
					 b[i] = b[s];
					 b[s] = e;
				 }
			 }
		 }
		 System.out.printf("%.2lf",a[0]);
		 for (i = 1;i < t;i++)
		 {
			 System.out.printf(" %.2lf",a[i]);
		 }
		 for (i = 0;i < d;i++)
		 {
			 System.out.printf(" %.2lf",b[i]);
		 }
		  return 0;
	}
}

