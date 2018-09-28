package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double dt;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
			dt = b * b - 4 * a * c;
			if (dt > 0)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n", (-b + Math.sqrt(dt)) / (2 * a), (-b - Math.sqrt(dt)) / (2 * a));
			}
			else if (dt == 0)
			{
				if (b == 0)
				{
					System.out.print("x1=x2=0\n");
				}
				else
				{
					System.out.printf("x1=x2=%.5f\n", -b / (2 * a));
				}
			}
			else
			{
				dt = -dt;
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", -b / (2 * a), Math.sqrt(dt) / (2 * a), -b / (2 * a), Math.sqrt(dt) / (2 * a));
			}
		}
		return 0;
	}
}

