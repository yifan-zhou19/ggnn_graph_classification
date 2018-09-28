package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double j;
		double s;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			j = Double.parseDouble(tempVar5);
		}
		j = j / 360 * 3.1415926;
		j = Math.cos(j);
		j = j * j * a * b * c * d;
		s = (a + b + c + d) / 2;
		S = (s - a) * (s - b) * (s - c) * (s - d) - j;
		if (S < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(S);
			System.out.printf("%.4lf",S);
		}
	}
}

