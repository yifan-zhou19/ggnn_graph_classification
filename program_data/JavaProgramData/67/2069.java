package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int w;
		double[] v = new double[2];
		double[] p = new double[2];
		double v0;
		double p0;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			v = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			v + 1 = tempVar3;
		}
		v0 = v[1] / v[0];
		m--;
		for (w = 0;w < m;w++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p + 1 = tempVar5;
			}
			p0 = p[1] / p[0];
			c = p0 - v0;
			if (c > 0.05)
			{
			System.out.print("better\n");
			}
			else
			{
				if (c < -0.05)
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

