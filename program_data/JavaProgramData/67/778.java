package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		float x;
		float y;
		float x1;
		float y1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x1 = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y1 = Float.parseFloat(tempVar3);
		}
		for (i = 0;i < k - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				y = Float.parseFloat(tempVar5);
			}
			if (y / x - y1 / x1 > 0.05F)
			{
			System.out.print("better\n");
			}
			if (y / x - y1 / x1 < -0.05F)
			{
			System.out.print("worse\n");
			}
			if ((y / x - y1 / x1 <= 0.05F) && (y / x - y1 / x1 >= -0.05F))
			{
			System.out.print("same\n");
			}
		}
		return 0;
	}
}

