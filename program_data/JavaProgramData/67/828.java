package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int zy;
		int yy;
		int zq;
		int yq;
		int i;
		float x;
		float y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zy = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yy = Integer.parseInt(tempVar3);
		}
		x = 1.0 * yy / zy;
		for (i = 0;i < n - 2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zq = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				yq = Integer.parseInt(tempVar5);
			}
			y = 1.0 * yq / zq;
			if (y - x > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (y - x < -0.05F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			zq = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			yq = Integer.parseInt(tempVar7);
		}
		y = 1.0 * yq / zq;
		if (y - x > 0.05F)
		{
			System.out.print("better");
		}
		else if (y - x < -0.05F)
		{
			System.out.print("worse");
		}
		else if (y - x >= -0.05F && y - x <= 0.05F)
		{
			System.out.print("same");
		}

		return 0;
	}
}

