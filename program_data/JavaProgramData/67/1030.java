package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		double q;
		double e;
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
		q = (double)b / (double)a;
		for (i = 2;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			e = (double)b / (double)a;
		if (e - q > 0.05)
		{
			System.out.print("better\n");
		}
		if (q - e > 0.05)
		{
			System.out.print("worse\n");
		}
		if ((e - q) * (e - q) <= 0.0025)
		{
			System.out.print("same\n");
		}
		}
		return 0;
	}


}

