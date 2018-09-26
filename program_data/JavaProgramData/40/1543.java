package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double h;
		double S;
		double s;
		double sum;
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
			h = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		sum = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(h * PI / 360),2);
		S = Math.sqrt(sum);
		if (h > 360 || h <= 0)
		{
			System.out.print("Error!");
		}
		else
		{
			if (sum < 0)
			{
				System.out.printf("%s\n","Invalid input");
			}
			else
			{
				System.out.printf("%.4lf\n",S);
			}
		}

		return 0;
	}
}

