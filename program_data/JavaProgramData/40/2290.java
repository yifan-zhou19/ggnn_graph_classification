package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double s = 0;
		double S_1 = 0;
		double S_2 = 0;
		double alpha_2 = 0;

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
			alpha_2 = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		S_2 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha_2 / 360 * PI) * Math.cos(alpha_2 / 360 * PI);

		if (S_2 < 0)
		{
				System.out.print("Invalid input\n");
		}
		else
		{
			S_1 = Math.sqrt(S_2);
			System.out.printf("%.4f",S_1);
		}
	}
}

