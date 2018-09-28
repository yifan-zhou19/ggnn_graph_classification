package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] z;
		int[] y;
		int i;
		double v1;
		double v2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		z = new int[n];
		y = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
		}
		v1 = 1.0 * y[0] / z[0];
		for (i = 1;i < n;i++)
		{
			v2 = 1.0 * y[i] / z[i];
			if (v2 - v1 > 0.05)
			{
				System.out.print("better\n");
			}
			else if (v1 - v2 > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

