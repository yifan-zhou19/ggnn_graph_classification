package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int a;
	int b;
	int c;
	int d;
	int e;
	int n;
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	e = 0;
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
			e = Integer.parseInt(tempVar2);
		}
		if (e < 19)
		{
			a++;
		}
		else if (e < 36)
		{
			b++;
		}
			else if (e < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
	}
	double f;
	double g;
	double h;
	double j;
	f = a * 1.0 / n;
	g = b * 1.0 / n;
	h = c * 1.0 / n;
	j = d * 1.0 / n;

	System.out.printf("1-18: %.2lf",100 * f);
	System.out.print("%%\n");
	System.out.printf("19-35: %.2lf",100 * g);
	System.out.print("%%\n");
	System.out.printf("36-60: %.2lf",100 * h);
	System.out.print("%%\n");
	System.out.printf("60??: %.2lf",100 * j);
	System.out.print("%%\n");


	return 0;
	}


}

