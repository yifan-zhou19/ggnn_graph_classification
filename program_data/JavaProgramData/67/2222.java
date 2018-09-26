package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] zbl = new double[100];
		double[] yxbl = new double[100];
		int i;
		int n;
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
				zbl[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				yxbl[i] = Double.parseDouble(tempVar3);
			}
		}
		double[] yxl = new double[100];
		for (i = 0;i < n;i++)
		{
			yxl[i] = yxbl[i] / zbl[i];
		}
		for (i = 1;i < n;i++)
		{
			if (yxl[0] - yxl[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			if (yxl[i] - yxl[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (yxl[0] - yxl[i] <= 0.05 && yxl[i] - yxl[0] <= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}


}

