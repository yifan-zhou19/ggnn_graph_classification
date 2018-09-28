package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			a[i] = 1.0 * y / x;
		}
		for (i = 1;i < n;i++)
		{
			z = a[i] - a[0];
			if (z > 0.05)
			{
				System.out.print("better\n");
			}
			else if (z < -0.05)
			{
				System.out.print("worse\n");
			}
			else if (z >= -0.05 && z <= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

