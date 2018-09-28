package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] y;
		int M;
		int m;
		int i;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		y = new double[n];
		double x;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		x = (double)m / M;

		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				M = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				m = Integer.parseInt(tempVar5);
			}

				y[i] = (double)m / M;
		}
		for (i = 0;i < n - 1;i++)
		{
				if (x - y[i] > 0.05)
				{
					System.out.print("worse\n");
				}

				else
				{
					if (y[i] - x > 0.05)
					{
					System.out.print("better\n");
					}

					else
					{
					System.out.print("same\n");

					}
				}
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(y);

		return 0;
	}
}

