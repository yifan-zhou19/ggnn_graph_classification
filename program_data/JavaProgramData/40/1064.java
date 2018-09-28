package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double angel;
		double sq;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			angel = Double.parseDouble(tempVar5);
		}
		sq = (b + c + d - a) / 2 * (c + d + a - b) / 2 * (d + a + b - c) / 2 * (a + b + c - d) / 2 - a * b * c * d * Math.pow(Math.cos(angel / 2 * PI / 180),2);
		if (sq < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			sq = Math.sqrt(sq);
			System.out.printf("%.4lf", sq);
		}
		return 0;
	}


}

