package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] zong = new int[1000];
		int[] youxiao = new int[1000];
		double[] c = new double[1000];
		double ji;
		double xin;
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
				(zong[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(youxiao[i]) = Integer.parseInt(tempVar3);
			}
		}
		ji = youxiao[0] * 1.0 / zong[0];
		for (i = 1;i < n;i++)
		{
			xin = youxiao[i] * 1.0 / zong[i];
			c[i] = xin - ji;
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] > 0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				if (c[i] < (-0.05))
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

