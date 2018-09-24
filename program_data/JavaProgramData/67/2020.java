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
		int p;
		int q;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		float e = (float)q / p;
		int i = 2;
		while (i <= n)
		{
			int x;
			int y;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				y = Integer.parseInt(tempVar5);
			}
			float f = (float)y / x;
			if ((f - e <= 0.05F) && (f - e >= -0.05F))
			{
				System.out.print("same\n");
			}
			else if (f < e)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("better\n");
			}
			i++;
		}
		return 0;
	}
}

