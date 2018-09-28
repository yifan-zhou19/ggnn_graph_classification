package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			double a;
			double b;
			double c;
			double x1 = 0;
			double x2 = 0;
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
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else
			{
				if (b * b - 4 * a * c == 0)
				{
				x1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
				}
				else
				{
					x1 = Math.sqrt(4 * a * c - b * b) / (2 * a);
					if (b == 0)
					{
					System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",x1,x1);
					}
					else
					{
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",(-1 * b) / (2 * a),x1,(-1 * b) / (2 * a),x1);
					}
				}
			}
		}
		return 0;
	}
}

