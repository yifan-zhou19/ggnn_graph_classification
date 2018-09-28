package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final double PI = 3.1415926;
		double a;
		double b;
		double c;
		double d;
		double alpha;
		double s;
		double sum;
		double radalpha;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			alpha = Double.parseDouble(tempVar5);
		}
		a = (double)a;
		b = (double)b;
		c = (double)c;
		d = (double)d;
		alpha = (double)alpha;
		s = (a + b + c + d) / 2;
		radalpha = alpha * PI / 360.0;
		sum = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(radalpha) * Math.cos(radalpha);
		if (sum < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
				S = Math.sqrt(sum);
				System.out.printf("%.4f",S);
		}
		return 0;
	}
}

