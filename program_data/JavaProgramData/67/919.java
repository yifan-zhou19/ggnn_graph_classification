package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		x = (double)b / a;
		for (i = 0;i < n - 1;i++)
		{
			double y;
			int m;
			int h;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				h = Integer.parseInt(tempVar5);
			}
			y = (double)h / m;
			if (y - x > 0.05)
			{
				System.out.print("better\n");
			}
			if (x - y > 0.05)
			{
				System.out.print("worse\n");
			}
			if (x - 0.05 <= y != 0 && y <= x + 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

