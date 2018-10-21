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

		int i;
		i = 1;
		do
		{
			double a;
			double b;
			double c;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = Double.parseDouble(tempVar4);
		}
		double x1;
		double x2;
		double disc;
		double realpart;
		double imagpart;
			disc = b * b - 4 * a * c;
		if (Math.abs(disc) <= 1e-6)
		{
		System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
		}
		else if (disc > 1e-6)
		{
			x1 = (-b + Math.sqrt(disc)) / (2 * a);
			x2 = (-b - Math.sqrt(disc)) / (2 * a);
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		}
		else
		{
		realpart = -b / (2 * a);
		imagpart = Math.sqrt(-disc) / (2 * a);
		if (b == 0)
		{
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b,imagpart,b,imagpart);
		}
		else
		{
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",realpart,imagpart,realpart,imagpart);
		}
		}
			i++;
		} while (i <= n);

	}

}

