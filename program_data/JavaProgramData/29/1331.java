package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int[] H = new int[100];
	int j;
	double[] SZ = new double[100];
	double[] s = new double[100];
	double[] z = new double[100];
	double[] x = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 2;i < 100;i++)
	{
		  z[0] = 2;
		  x[0] = 1;
	   z[1] = 3;
	   x[1] = 2;
	   z[i] = z[i - 1] + z[i - 2];
	   x[i] = x[i - 1] + x[i - 2];
	}


	for (i = 0;i < m;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 H[i] = Integer.parseInt(tempVar2);
		 }
	}
	for (j = 0;j < m;j++)
	{
		s[0] = 0;
	for (i = 0;i < H[j];i++)
	{
		SZ[i] = 1.00000 * z[i] / x[i];
	   s[j] += SZ[i];
	}
		System.out.printf("%.3lf\n",s[j]);
		s[j + 1] = 0;
	}
	 return 0;
	}

}

