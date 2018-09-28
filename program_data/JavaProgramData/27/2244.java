package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 double[] a = new double[100];
	 double[] b = new double[100];
	 double[] c = new double[100];
	 double[] x1 = new double[100];
	 double[] x2 = new double[100];
	 double[] m = new double[100];
	 double[] w = new double[100];
	 int i;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 c[i] = Double.parseDouble(tempVar4);
		 }
		 if ((b[i] * b[i] - 4 * a[i] * c[i]) >= 0)
		 {
		 x1[i] = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
		 x2[i] = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
		 {
		 if (x1[i] != x2[i] && x1[i] != 0 && x2[i] != 0)
		 {
			 System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
		 }
		else if (x1[i] != x2[i] && x1[i] == 0 && x2[i] != 0)
		{
			 System.out.printf("x1=0.00000;x2=%.5lf\n",x2[i]);
		}
		else if (x1[i] != x2[i] && x1[i] != 0 && x2[i] == 0)
		{
			 System.out.printf("x1=%.5lf;x2=0.00000\n",x1[i]);
		}
		 else if (x1[i] == x2[i] && x1[i] != 0)
		 {
			 System.out.printf("x1=x2=%.5lf\n",x1[i]);
		 }
		 else if (x1[i] == x2[i] && x1[i] == 0)
		 {
			 System.out.print("x1=x2=0.00000\n");
		 }
		 };
		 }
			 if ((b[i] * b[i] - 4 * a[i] * c[i]) < 0)
			 {
				 m[i] = -b[i] / (2 * a[i]);
				 w[i] = Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]);

			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m[i],w[i],m[i],w[i]);
			 }

	 }
	 return 0;
	}

}

