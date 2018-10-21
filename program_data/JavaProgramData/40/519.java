package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	double a;
	double b;
	double c;
	double d;
	double e;
	double f;
	double h;
	double s;
	double i;
	double j;
	double S;
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
			e = Double.parseDouble(tempVar5);
		}
		f = e / 2;
		h = Math.cos((f / 360) * 2 * 3.1415926);
		s = (a + b + c + d) / 2;
		i = (s - a) * (s - b) * (s - c) * (s - d);
		j = (a * b * c * d * h * h);
		if (i - j < 0)
		{
		System.out.print("Invalid input\n");
		}
	else
	{
			S = Math.sqrt(i - j);
		System.out.printf("%.4lf\n",S);
	}
	}


}

