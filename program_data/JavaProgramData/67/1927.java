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
		int[] r = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		x = 1.0 * b[0] / a[0];
		for (i = 1;i < n;i++)
		{
			y = 1.0 * b[i] / a[i];
			if (y - x > 0.05)
			{
				r[i] = 1;
			}
			else if (x - y > 0.05)
			{
				r[i] = -1;
			}
			else
			{
				r[i] = 0;
			}
		}
		for (i = 1;i < n;i++)
		{
			switch (r[i])
			{
			case 1:
				System.out.print("better\n");
				break;
			case 0:
				System.out.print("same\n");
				break;
			case -1:
				System.out.print("worse\n");
				break;
			}
		}
		return 0;
	}
}

