package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double a;
		double b;
		double c;
		double d;
		double angle;
		double S;
		double x;
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
			angle = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		x = Math.pow(Math.cos(angle * 3.1415926 / 360),2);
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * x);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * x < 0)
		{
		   System.out.print("Invalid input");
		}
		 else
		 {
			System.out.printf("%.4lf",S);
		 }
		return 0;
	}
}

