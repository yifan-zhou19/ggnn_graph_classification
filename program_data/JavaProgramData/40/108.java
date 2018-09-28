package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
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
		double n;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Double.parseDouble(tempVar5);
		}
		double s;
		double N;
		s = (a + b + c + d) / 2;
		N = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(PI * n / 360) * Math.cos(PI * n / 360);
		if (N < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			 double S;
			 S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(PI * n / 360) * Math.cos(PI * n / 360));
			 System.out.printf("%.4f",S);
		}
	}


}

