package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int m;
		int j;
		double c;
		double d;
		double biao;
		double e;
		double f;
		double g;
		double t;
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
		c = a * 1.0000000;
		d = b * 1.0000000;
		biao = d / c;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				j = Integer.parseInt(tempVar5);
			}
			e = m * 1.0000000;
			f = j * 1.0000000;
			g = f / e;
			t = g - biao;
			if (t > 0.05)
			{
				System.out.print("better\n");
				continue;
			}
			if ((biao - g) > 0.05)
			{
				System.out.print("worse\n");
				continue;
			}
			System.out.print("same\n");
		}
		return 0;
	}

}

