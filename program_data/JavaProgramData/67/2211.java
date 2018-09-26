package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		double x;
		double y;
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] bls = new int[100];
		int[] lxs = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bls[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				lxs[i] = Integer.parseInt(tempVar3);
			}
		}
		a = bls[0];
		b = lxs[0];
		x = (b / a) * 100;
		for (i = 1;i < n;i++)
		{
			a = bls[i];
			b = lxs[i];
			y = (b / a) * 100;
			if (y - x > 5)
			{
				System.out.print("better\n");
			}
			else if (x - y > 5)
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

