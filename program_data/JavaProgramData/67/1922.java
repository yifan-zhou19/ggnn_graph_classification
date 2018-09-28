package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int s;
		int i;
		double[] sz = new double[c];
		double p;
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s = Integer.parseInt(tempVar3);
			}
			p = s * 1.0 / m;
			sz[i] = p;
		}
		for (i = 1;i < n;i++)
		{
			p = sz[i] - sz[0];
			if (p <= 0.05 && p >= -0.05)
			{
				System.out.print("same\n");
			}
			else if (p > 0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("worse\n");
			}
		}
		return 0;
	}
}

