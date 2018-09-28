package <missing>;

public class GlobalMembers
{
	public static float f(double a,double b,double c)
	{
		double x1;
		double x2;
		double A;
		A = b * b - 4 * a * c;
		if (A > 0)
		{
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=%.5f;x2=%.5f",x1,x2);
		};
		if (0 == A)
		{
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=x2=%.5f",x1);
		};
		if (A < 0)
		{
			double x3;
			double x4;
			x1 = -b / (2 * a);
			if (0 == x1)
			{
			x1 = 0;
			}
			x3 = Math.sqrt(-(b * b - 4 * a * c) / (4 * a * a));
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",x1,x3,x1,x3);
		};
		return 0F;

	}
	public static int Main()
	{
		double[] a = new double[20];
		double[] b = new double[20];
		double[] c = new double[20];
		int i;
		int n;
		int t;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Double.parseDouble(tempVar4);
			}
		};
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
			System.out.print("\n");
			}
			t = f(a[i], b[i], c[i]);
		}



	}

}

