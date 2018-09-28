package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] zbl = new int[200];
		int[] yxbl = new int[100];
		double x;
		double[] y = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zbl[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yxbl[0] = Integer.parseInt(tempVar3);
		}
		x = 1.0 * yxbl[0] / zbl[0];
		for (int i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zbl[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				yxbl[i] = Integer.parseInt(tempVar5);
			}
			y[i] = 1.0 * yxbl[i] / zbl[i];
			if (y[i] - x > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x - y[i] > 0.05)
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

