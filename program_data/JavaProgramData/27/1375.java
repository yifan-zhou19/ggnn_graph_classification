package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] A = new double[15];
		double[] B = new double[15];
		double[] C = new double[15];
		double x1;
		double x2;
		double m;
		double y;
		int i;
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
				A[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				B[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				C[i] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = B[i] * B[i] - 4 * A[i] * C[i];
		if (m < 0)
		{
			y = Math.sqrt(-m) / (2 * A[i]);
		if (B[i] == 0)
		{
		System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",(B[i]) / (2 * A[i]),y,(B[i]) / (2 * A[i]),y);
		}
		else
		{
		System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",(-B[i]) / (2 * A[i]),y,(-B[i]) / (2 * A[i]),y);
		}
		}
		else if (m == 0)
		{
			x1 = (-B[i]) / (2 * A[i]);
			System.out.printf("x1=x2=%.5lf\n",x1);
		}
		else
		{
			x1 = (-B[i] + Math.sqrt(m)) / (2 * A[i]);
		x2 = (-B[i] - Math.sqrt(m)) / (2 * A[i]);
		System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		}
		}
		return 0;
	}

}

