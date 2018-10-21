package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int lc;
		int yx;
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
			lc = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yx = Integer.parseInt(tempVar3);
		}
			x = 1.0 * yx / lc;
		for (i = 0;i < n - 1;i++)
		{
			lc = 0;
			yx = 0;
			y = 0F;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				lc = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				yx = Integer.parseInt(tempVar5);
			}
			y = 1.0 * yx / lc;
			if ((y - x) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((x - y) > 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((y - x) <= 0.05 && (x - y) <= 0.05)
			{
				System.out.print("same\n");
			}

		}
		return 0;
	}
}

