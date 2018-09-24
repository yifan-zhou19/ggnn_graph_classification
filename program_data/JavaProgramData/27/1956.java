package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
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
			d = b * b - 4 * a * c;

			if (d > 0)
			{
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (d == 0)
			{
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (d < 0)
			{
				double t;
				t = Math.sqrt(-d);
				System.out.printf("x1=-%.5lf+%.5lfi;x2=-%.5lf-%.5lfi\n",b / (2 * a),t / (2 * a),b / (2 * a),t / (2 * a));
			}
		}
	}

}

