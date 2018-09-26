package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		double x;
		double y;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
			x = 1.0 * b[i] / a[i];
			}
			if (i > 0)
			{
				y = 1.0 * b[i] / a[i];
				if (y - x > 0.05)
				{
					System.out.print("better\n");
				}
				if (x - y > 0.05)
				{
					System.out.print("worse\n");
				}
				else if (x - y >= -0.05 && x - y <= 0.05)
				{
					 System.out.print("same\n");
				}
			}
		}
		return 0;
	}
}

