package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int c;
		int d;
		int e;
		int f;
		double p;
		double q;
		double o;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		p = (double)b / a;
		for (i = 0;i < n - 2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d = Integer.parseInt(tempVar5);
			}
			q = (double)d / c;
			if (p - q > 0.05)
			{
				System.out.print("worse");
							System.out.print("\n");
			}
			else
			{
				if (q - p > 0.05)
				{
					System.out.print("better");
									System.out.print("\n");
				}
				else
				{
					System.out.print("same");
									System.out.print("\n");
				}
			}
		}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				e = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				f = Integer.parseInt(tempVar7);
			}
			o = (double)f / e;
			if (p - o > 0.05)
			{
			System.out.print("worse");
			}
		else
		{
			if (o - p > 0.05)
			{
				System.out.print("better");
			}
			else
			{
				System.out.print("same");
			}
		}
		return 0;
	}
}

