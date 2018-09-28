package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		double m;
		double n;
		double[] sz1 = new double[100];
		double[] sz2 = new double[100];
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Double.parseDouble(tempVar3);
		}
		x = 1.0 * n / m;

		for (i = 1;i < t;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sz1[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				sz2[i] = Double.parseDouble(tempVar5);
			}
		}
		for (i = 1;i < t;i++)
		{
			y = 1.0 * sz2[i] / sz1[i];
			if (y - x > 0.05)
			{
				System.out.printf("better\n",y,x);
			}
			if (x - y > 0.05)
			{
				System.out.print("worse\n");
			}
			if (x - y <= 0.05 && y - x <= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

