package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double zs;
		double yx;
		double yxl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zs = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			yx = Double.parseDouble(tempVar3);
		}
		a = (yx / zs) * 100;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zs = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				yx = Double.parseDouble(tempVar5);
			}
			yxl = (yx / zs) * 100;
			if (yxl >= a)
			{
				if ((yxl - a) > 5)
				{
					System.out.print("better\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		else
		{
				if ((a - yxl) > 5)
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

