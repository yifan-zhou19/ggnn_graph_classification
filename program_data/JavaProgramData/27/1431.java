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
		double deta;
		double sq;
		double x1;
		double x2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
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
			deta = b * b - 4 * a * c;
			if (deta == 0)
			{
				x1 = x2 = -b / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else if (deta > 0)
			{
				x1 = (-b + Math.sqrt(deta)) / (2 * a);
				x2 = (-b - Math.sqrt(deta)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else
			{
				sq = Math.sqrt(0 - deta) / (2 * a);
				x1 = -b / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,sq,x1,sq);
			}
			i++;
		}
		return 0;
	}
}

