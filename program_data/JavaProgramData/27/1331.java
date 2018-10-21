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
		double a;
		double b;
		double c;
		for (i = 0;i < n;i++)
		{
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
		if ((b * b - 4 * a * c) > 0)
		{
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.printf("x1=%.5lf;",x1);
		System.out.printf("x2=%.5lf\n",x2);
		}


		if ((b * b - 4 * a * c) == 0)
		{
			x1 = (-b / (2 * a));
		System.out.printf("x1=x2=%.5lf\n",x1);
		}

		if ((b * b - 4 * a * c) < 0)
		{
			x1 = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
		x2 = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
		System.out.printf("x1=%.5lf+%.5lfi;",-b / (2 * a),x1);
		System.out.printf("x2=%.5lf-%.5lfi\n",-b / (2 * a),x2);
		}
		}
		return 0;
	}

}

