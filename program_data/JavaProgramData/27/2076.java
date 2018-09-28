package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double p = 0.000001;
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
		if (b * b - 4 * a * c < -p.getValue() != 0)
		{
			x1 = -b / (2 * a);
			x2 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
			if (x1 > -p && x1 < p)
			{
				x1 = 0;
			}
			if (x2 > -p && x2 < p)
			{
				x2 = 0;
			}
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2);
		}
		else
		{
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			if (x1 > -p && x1 < p)
			{
				x1 = 0;
			}
			if (x2 > -p && x2 < p)
			{
				x2 = 0;
			}
			if (b * b - 4 * a * c < p && b * b - 4 * a * c>-p)
			{
			System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
		}
	}

	}

}

