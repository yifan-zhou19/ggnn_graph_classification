package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Double.parseDouble(tempVar3);
		}
		x = b[0] / a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Double.parseDouble(tempVar5);
			}
			c[i] = b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - x > 0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				if (x - c[i] > 0.05)
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

