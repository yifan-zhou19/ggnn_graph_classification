package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double di;
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
			di = b * b - a * c * 4;
			if (di < 0)
			{
				di = di * (-1);
				if (b / (2 * a) < 0.000001 && -0.000001 < b / (2 * a))
				{
					b = 0;
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",b / (2 * a),Math.sqrt(di) / (2 * a),b / (2 * a),(-1) * Math.sqrt(di) / (2 * a));
				}
				else
				{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",(-1) * b / (2 * a),Math.sqrt(di) / (2 * a),(-1) * b / (2 * a),(-1) * Math.sqrt(di) / (2 * a));
				}
				di = -1;
			}
			if (di == 0)
			{
				//printf("%lf\n",(abs(b/(2*a))));
				if (b / (2 * a) < 0.000001 && -0.000001 < b / (2 * a))
				{
					b = 0;
					System.out.printf("x1=x2=%.5lf\n",b / (2 * a));
				}
				System.out.printf("x1=x2=%.5lf\n",(-1) * b / (2 * a));
			}
			if (di > 0)
			{
				if (b / (2 * a) < 0.000001 && -0.000001 < b / (2 * a))
				{
					b = 0;
					System.out.printf("x1=%.5lf;x2=%.5lf\n",b / (2 * a) + Math.sqrt(di) / (2 * a),b / (2 * a) + (-1) * Math.sqrt(di) / (2 * a));
				}
				System.out.printf("x1=%.5lf;x2=%.5lf\n",(-1) * b / (2 * a) + Math.sqrt(di) / (2 * a),(-1) * b / (2 * a) + (-1) * Math.sqrt(di) / (2 * a));
			}
		}
	}
}

