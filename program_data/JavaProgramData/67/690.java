package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s1;
		int e1;
		int s2;
		int e2;
		int i;
		int t = 0;
		double x1;
		double x2;
		double c1;
		double c2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			e1 = Integer.parseInt(tempVar3);
		}
		x1 = (double)e1 / s1;
		for (i = 0;i < n - 1;i++)
		{
			t = 0;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e2 = Integer.parseInt(tempVar5);
			}
			x2 = (double)e2 / s2;
			c1 = x1 - x2;
			c2 = x2 - x1;
			if (c2 > 0.05)
			{
				System.out.print("better\n");
				t = 1;
			}
			if (c1 > 0.05)
			{
				System.out.print("worse\n");
				t = 1;
			}
			if (t == 0)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

