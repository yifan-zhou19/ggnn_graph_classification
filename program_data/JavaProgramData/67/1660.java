package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int j;
		double[] a = new double[100];
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
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			a[i] = 1.0 * j / y;
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] >= a[0])
			{
				if (a[i] - a[0] > 0.05)
				{
					System.out.print("better\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
			if (a[i] < a[0])
			{
				if (a[0] - a[i] > 0.05)
				{
					System.out.print("worse\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		}
		return 0;
	}

}

