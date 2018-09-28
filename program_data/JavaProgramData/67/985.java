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
		double a;
		double b;
		double c;
		double m;
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
		c = b / a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct d
	//	{
	//		double e;
	//		double f;
	//		double g;
	//	}
	//	d[100];
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i].e = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d[i].f = tempVar5;
			}
		}
		for (int k = 0;k < n - 1;k++)
		{
			d[k].g = d[k].f / d[k].e;
			m = c - d[k].g;
			if (m > 0.05)
			{
				System.out.print("worse\n");
			}
			if (m < (-0.05))
			{
				System.out.print("better\n");
			}
			if (m <= 0.05 && m >= -0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

