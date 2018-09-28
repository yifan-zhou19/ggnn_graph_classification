package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double[] a = new double[100];
		double g;
		double f;
		double x;
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
				g = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				f = Double.parseDouble(tempVar3);
			}
			a[i] = f / g;
			x = a[0];
		}
		for (i = 1;i < n;i++)
		{
			if ((a[i] - x) > 0.05)
			{
					System.out.print("better\n");
			}
			if ((x - a[i]) > 0.05)
			{
					System.out.print("worse\n");
			}
			else if ((a[i] - x <= 0.05) && (x - a[i] <= 0.05))
			{
					System.out.print("same\n");
			}
		}
		return 0;
	}
}

