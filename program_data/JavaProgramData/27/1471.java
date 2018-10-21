package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		double a;
		double b;
		double c;
		double[] A = new double[999];
		double[] B = new double[999];
		double[] C = new double[999];
		double delta;
		double x1;
		double x2;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				B[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				C[i] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = A[i];
			b = B[i];
			c = C[i];
			delta = b * b - 4 * a * c;
			if (delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if (delta == 0)
			{
				x1 = x2 = (-b) / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else if (delta < 0)
			{
				double shibu;
				double xubu;
				shibu = (-b) / (2 * a);
				xubu = Math.sqrt(-delta) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",shibu,xubu,shibu,xubu);
			}
		}
	}
}

