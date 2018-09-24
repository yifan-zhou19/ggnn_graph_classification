package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] x1 = new double[32768];
		double[] x2 = new double[32768];
		double[] xi = new double[32768];
		double a;
		double b;
		double c;
		double t;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			t = b * b - 4 * a * c;
			if (t >= 0)
			{
			x1[i] = (-b + Math.sqrt(t)) / (2 * a);
			x2[i] = (-b - Math.sqrt(t)) / (2 * a);
			if (Math.abs(x1[i]) < 1e-6)
			{
				x1[i] = 0;
			}
			if (Math.abs(x2[i]) < 1e-6)
			{
				x2[i] = 0;
			}
			}
			else if (t < 0)
			{
				x1[i] = x2[i] = -b / (2 * a);
				if (Math.abs(x1[i]) < 1e-6)
				{
					x1[i] = x2[i] = 0;
				}
				xi[i] = Math.sqrt(-t) / (2 * a);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(xi[i]) <= 1e-6)
			{
				if (x1[i] == x2[i])
				{
					System.out.printf("x1=x2=%.5f\n",x1[i],x2[i]);
				}
					else
					{
						System.out.printf("x1=%.5f;x2=%.5f\n",x1[i],x2[i]);
					}
			}
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1[i],xi[i],x2[i],xi[i]);
			}
		}
	}
}

