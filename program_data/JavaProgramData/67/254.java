package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] zongshu = new int[1000];
		int[] youxiao = new int[1000];
		double x;
		double[] y = new double[1000];
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
				zongshu[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				youxiao[i] = Integer.parseInt(tempVar3);
			}
		}
		x = (double)youxiao[0] / zongshu[0];
		for (i = 1;i < n;i++)
		{
			y[i] = (double)youxiao[i] / zongshu[i];
			if (x - y[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else if (y[i] - x > 0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

