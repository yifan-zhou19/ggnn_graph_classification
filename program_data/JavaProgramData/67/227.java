package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] bing = new int[100];
		int[] you = new int[100];
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bing[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				you[i] = Integer.parseInt(tempVar3);
			}
		}
		c = 100.00 * (1.000 * you[0] / bing[0]);
		for (i = 1;i < n;i++)
		{
			d = 100.00 * (1.000 * you[i] / bing[i]);
			if ((d - c) > 5.00)
			{
				System.out.print("better\n");
			}
			else if ((c - d) > 5.00)
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

