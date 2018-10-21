package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double m;
	double p;
	double c;
	double q;
	for (i = 0;i < n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Double.parseDouble(tempVar3);
			}
			if (i == 0)
			{
		c = p / m;
			}
		else
		{
		q = p / m;
		if (q - c > 0.05)
		{
		System.out.print("better\n");
		}
		else if (c - q > 0.05)
		{
		System.out.print("worse\n");
		}
		else
		{
		System.out.print("same\n");
		}
		}
	}
	return 0;
	}
}

