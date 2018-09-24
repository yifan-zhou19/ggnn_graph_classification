package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int b1;
		int b2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a2 = Integer.parseInt(tempVar3);
		}
		float x;
		float y;
		x = (float)a2 / a1;
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b1 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b2 = Integer.parseInt(tempVar5);
			}
			y = (float)b2 / b1;
			if ((y - x) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((x - y) > 0.05)
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

