package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int th;
		int i;
		int to;
		int s;
		float c;
		float r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			th = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			to = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s = Integer.parseInt(tempVar3);
		}
		c = 1.0 * s / to;
		for (i = 0;i < th - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				to = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				s = Integer.parseInt(tempVar5);
			}
			r = 1.0 * s / to;
			if (r > c && r - c > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (r < c && c - r>0.05F)
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

