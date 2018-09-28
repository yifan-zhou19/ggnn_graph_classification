package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		double a;
		double b;
		double ratecoil;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Double.parseDouble(tempVar3);
		}
		ratecoil = b / a;
		double rate;
		for (i = 0;i < n - 1;i++)
		{
			a = b = rate = 0;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b = Double.parseDouble(tempVar5);
			}
			rate = b / a;
			if (rate > ratecoil)
			{
				if ((rate - ratecoil) > 0.05)
				{
					System.out.print("better\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
			if (rate == ratecoil)
			{
				System.out.print("same\n");
			}
			if (rate < ratecoil)
			{
				if ((ratecoil - rate) > 0.05)
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

