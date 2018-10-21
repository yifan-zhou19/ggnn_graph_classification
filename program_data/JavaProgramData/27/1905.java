package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double n;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (m = 1;m <= n;m++)
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
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		if (b * b - 4 * a * c > 0)
		{
					   System.out.printf("x1=%.5lf;x2=%.5lf\n",((0 - b) + Math.sqrt(b * b - 4 * a * c)) / (2 * a),((0 - b) - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		}
		else if (b * b - 4 * a * c == 0)
		{
							System.out.printf("x1=x2=%.5lf\n",x1);
		}
		else
		{
						 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",((0 - b)) / (2 * a),Math.sqrt(4 * a * c - b * b) / (2 * a),((0 - b)) / (2 * a),Math.sqrt(4 * a * c - b * b) / (2 * a));
		}
		}

	}
}

