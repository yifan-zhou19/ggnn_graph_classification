package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		double x1;
		double x2;
		double a;
		double b;
		double c;
		double d;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 1;
		do
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
		d = b * b - 4 * a * c;
		if (d >= 0)
		{
			if (d > 0)
			{
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		k = k + 1;
			}
		else
		{
			System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
			k = k + 1;
		}
		}
			else
			{
				if (b == 0)
				{
			System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",Math.sqrt(-b * b + 4 * a * c) / (2 * a),Math.sqrt(-b * b + 4 * a * c) / (2 * a));
				}
			else
			{
				e = (-b) / (2 * a);
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,Math.sqrt(-b * b + 4 * a * c) / (2 * a),e,Math.sqrt(-b * b + 4 * a * c) / (2 * a));
			}
			k = k + 1;
			}
		}while (k <= n);
	}
}

