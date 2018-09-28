package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n;
		double a;
		double b;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
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
			if (b * b - 4 * a * c > 0)
			{
				System.out.printf("x1=%.5f;x2=%.5f",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			}
			else if (b * b - 4 * a * c < 1e-7 && b * b - 4 * a * c>-1e-7)
			{
				System.out.printf("x1=x2=%.5f",-b / (2 * a));
			}
			else if (b / (2 * a) < 1e-7 && b / (2 * a)>-1e-7)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",0.0,(1 / (2 * a)) * Math.sqrt(4 * a * c - b * b),0.0,(1 / (2 * a)) * Math.sqrt(4 * a * c - b * b));
			}
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",-b / (2 * a),(1 / (2 * a)) * Math.sqrt(4 * a * c - b * b),-b / (2 * a),(1 / (2 * a)) * Math.sqrt(4 * a * c - b * b));
			}
			i++;
			System.out.print("\n");
		}
	}
}

