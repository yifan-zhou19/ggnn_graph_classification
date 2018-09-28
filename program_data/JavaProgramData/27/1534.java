package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			double a;
			double b;
			double c;
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
			double d = b * b - 4 * a * c;
			double mid = -b / (2 * a);
			double dif = Math.sqrt(Math.abs(d)) / (2 * a);
			if (mid == 0)
			{
				mid = 0;
			}
			if (d > 0)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n", mid + dif, mid - dif);
			}
			if (d == 0)
			{
				System.out.printf("x1=x2=%.5f\n", mid);
			}
			if (d < 0)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", mid, Math.abs(dif), mid, Math.abs(dif));
			}
		}
		return 0;
	}
}

