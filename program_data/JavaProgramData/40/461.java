package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double A;
		double B;
		double s;
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
			A = Double.parseDouble(tempVar5);
		}
		B = ((A / 2) / 360) * 2 * pi;
		s = (double)1 / 2 * (a + b + c + d);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(B) * Math.cos(B) >= 0.getValue() != 0)
		{
			S = (double)Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(B) * Math.cos(B));
		System.out.printf("%.4f",S);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
	return 0;
	}






}

