package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double lx1;
		double[] lx2 = new double[1000];
		double br1;
		double[] br2 = new double[1000];
		double yx1;
		double[] yx2 = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			br1 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			yx1 = Double.parseDouble(tempVar3);
		}
		lx1 = yx1 / br1;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				br2[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				yx2[i] = Double.parseDouble(tempVar5);
			}
			lx2[i] = yx2[i] / br2[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			if (lx2[i] - lx1 > 0.05)
			{
				System.out.print("better\n");
			}
			else if (lx1 - lx2[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((lx1 - lx2[i] <= 0.05 && lx1 - lx2[i] >= 0) || (lx2[i] - lx1 <= 0.05 && lx2[i] - lx1 >= 0))
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

