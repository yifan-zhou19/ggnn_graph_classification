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
		double a;
		double b;
		double c;
		for (j = 0;j < n;j++)
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
			if ((b * b - 4 * a * c) > 0)
			{
				double x1;
				double x2;
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if ((b * b - 4 * a * c) < 0)
			{
				if (b != 0)
				{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",(-b / (2 * a)),Math.sqrt(4 * a * c - b * b) / (2 * a),(-b / (2 * a)),Math.sqrt(4 * a * c - b * b) / (2 * a));
				}
				else
				{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",0.00000,Math.sqrt(4 * a * c - b * b) / (2 * a),0.00000,Math.sqrt(4 * a * c - b * b) / (2 * a));
				}
			}
			if ((b * b - 4 * a * c) == 0)
			{
				double x1;
				double x2;
				x1 = x2 = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
		}
	}


}

