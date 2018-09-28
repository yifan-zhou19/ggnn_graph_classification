package <missing>;

public class GlobalMembers
{
	public static void gen(double a, double b, double c)
	{
		double d;
		double x1;
		double x2;
		double i1;
		d = b * b - 4 * a * c;
			if (d > 0)
			{
				x1 = (0 - b + Math.sqrt(d)) / (2 * a);
				x2 = (0 - b - Math.sqrt(d)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else
			{
				if (d == 0)
				{
					System.out.printf("x1=x2=%.5f\n",(0 - b) / (2 * a));
				}
				else
				{
					x1 = (0 - b) / (2 * a);
					i1 = (Math.sqrt(0 - d)) / (2 * a);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,i1,x1,i1);
				}
			}
	}
	public static int Main()
	{
		double[] a;
		double[] b;
		double[] c;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new double[n];
		b = new double[n];
		c = new double[n];
		for (i = 0;i <= n - 1;i++)
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
		}
		for (i = 0;i <= n - 1;i++)
		{
			gen(a[i], b[i], c[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);
		return 0;
	}
}

