package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] bingli = new double[N][2];
		int n;
		int i;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bingli[0][0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			bingli[0][1] = Double.parseDouble(tempVar3);
		}
		x = bingli[0][1] / bingli[0][0];
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				bingli[i][0] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				bingli[i][1] = Double.parseDouble(tempVar5);
			}
			y = bingli[i][1] / bingli[i][0];
			if ((y - x) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((x - y) > 0.05)
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

