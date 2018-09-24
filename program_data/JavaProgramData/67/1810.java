package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int t;
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			if (1.0 * b / a - 1.0 * t / s > 0.05)
			{
				System.out.print("better\n");
			}
			else if (1.0 * b / a - 1.0 * t / s < -0.05)
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

