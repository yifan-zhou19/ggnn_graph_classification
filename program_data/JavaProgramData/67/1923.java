package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] zong = new int[n];
		int[] you = new int[n];

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zong[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				you[i] = Integer.parseInt(tempVar3);
			}
		}
		x = ((double)you[0]) / (zong[0]);
		for (i = 1;i < n;i++)
		{
			y = ((double)you[i] / zong[i]);
			if (y - x > 0.05)
			{
				System.out.print("better");
			}
			if (x - y > 0.05)
			{
				System.out.print("worse");
			}
			if (x - y <= 0.05 && y - x <= 0.05)
			{
				System.out.print("same");
			}
			if (i < n)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

