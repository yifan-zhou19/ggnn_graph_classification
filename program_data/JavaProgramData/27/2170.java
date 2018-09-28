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
		double t;
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
			t = b * b - 4 * a * c;
			if (t > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else
			{
				if (t == 0.0)
				{
					x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					System.out.printf("x1=x2=%.5lf\n",x1);
				}
				else
				{
					if (b == 0.0)
					{
						x1 = (b / (2 * a));
						x2 = Math.sqrt((4 * a * c - b * b) / (4 * a * a));
						System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
					}
					else
					{
						x1 = (-b / (2 * a));
						x2 = Math.sqrt((4 * a * c - b * b) / (4 * a * a));
						System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
					}
				}
			}
		}
		return 0;
	}
}

