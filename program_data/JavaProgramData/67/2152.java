package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int zong;
		int hao;
		double x0;
		double x;

		String tempVar = ConsoleInput.scanfRead(" ");
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			zong = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			hao = Integer.parseInt(tempVar3);
		}
		x0 = hao / (zong * 1.0);

		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				zong = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				hao = Integer.parseInt(tempVar5);
			}
			x = hao / (zong * 1.0);
			if (x - x0 > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x0 - x > 0.05)
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

