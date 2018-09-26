package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			double a;
			double b;
			double c;
			double d;
			double e;
			double x1;
			double x2;
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
			e = -(b / (2 * a));
			if (d > 0)
			{
				x1 = e + (Math.sqrt(d)) / (2 * a);
				x2 = e - (Math.sqrt(d)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (d == 0)
			{
				x1 = e;
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (d < 0)
			{
				d = -d;
				if (b != 0)
				{

				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,(Math.sqrt(d)) / (2 * a),e,(Math.sqrt(d)) / (2 * a));
				}
				if (b == 0)
				{

					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",b,(Math.sqrt(d)) / (2 * a),b,(Math.sqrt(d)) / (2 * a));
				}
			}

		}

	}
}

