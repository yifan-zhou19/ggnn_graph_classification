package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p, a,b,c, dt, x1, x2;
		double p;
		double a;
		double b;
		double c;
		double dt;
		double x1;
		double x2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = malloc((Double.SIZE / Byte.SIZE) * 3 * n);

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i * 3 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p + i * 3 + 1 = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p + i * 3 + 2 = Double.parseDouble(tempVar4);
			}
		}

		for (i = 0; i < n; i++)
		{
			a = (p + i * 3);
			b = (p + i * 3 + 1);
			c = (p + i * 3 + 2);
			dt = b * b - 4 * a * c;

			if (dt > 0)
			{
				x1 = (-b + Math.sqrt(dt)) / (2 * a);
				x2 = (-b - Math.sqrt(dt)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n", x1, x2);
			}
			else if (Math.abs(dt) < 0.00001)
			{
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5f\n", x1);
			}
			else
			{
				x1 = (-b) / (2 * a);
				if (Math.abs(x1) < 0.00001)
				{
					x1 = 0;
				}
				x2 = Math.sqrt(-dt) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", x1, x2, x1, x2);
			}
		}

	}

}

