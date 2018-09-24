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
		if (b * b - 4 * a * c > 0)
		{
			System.out.printf("x1=%.5lf;x2=%.5lf\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		}
		else if (b * b - 4 * a * c == 0)
		{
			System.out.printf("x1=x2=%.5lf\n",-b / (2 * a));
		}
		else
		{
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-b / (2 * a), Math.sqrt(4 * a * c - b * b) / (2 * a),-b / (2 * a),Math.sqrt(4 * a * c - b * b) / (2 * a));
		}
		}
		return 0;
	}
}

