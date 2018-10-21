package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double x1;
		double x2;
		double y1;
		double y2;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			p = b * b - 4 * a * c;
			if (p == 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			if (p > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			if (p < 0)
			{
				y1 = (-b) / (2 * a);
				y2 = Math.sqrt(-p) / (2 * a);
				if (y1 == -0)
				{
					y1 = 0;
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",y1,y2,y1,y2);
			}
		}




		return 0;
	}
}

