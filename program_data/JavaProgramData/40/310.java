package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double apha;
		double m = 0;
		double S = 0;
		double del = 0;
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
			apha = Double.parseDouble(tempVar5);
		}
		apha = apha * PI / 360;
		m = (a + b + c + d) * 0.5;
		del = (m - a) * (m - b) * (m - c) * (m - d) - a * b * c * d * Math.cos(apha);
		if (del >= 0)
		{
			S = Math.sqrt((m - a) * (m - b) * (m - c) * (m - d) - a * b * c * d * Math.cos(apha) * Math.cos(apha));
			System.out.printf("%.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}


}

