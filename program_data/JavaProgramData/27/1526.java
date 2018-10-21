package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double x1;
		double x2;
		double a;
		double b;
		double c;
		double x;
		double y;
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
			x = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			if (x > 0)
			{
				x1 = -b / (2 * a) + x;
				x2 = -b / (2 * a) - x;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if (x == 0)
			{
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{

	y = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
	x1 = -b / (2 * a);
				System.out.printf("x1=%.5lf",x1);
				System.out.printf("+%.5lf",y);
				System.out.print("i;");
				System.out.printf("x2=%.5lf",x1);
				System.out.printf("-%.5lf",y);
	System.out.print("i\n");
			}
		}
	}
}

