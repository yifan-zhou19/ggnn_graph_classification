package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] bl = new int[10000];
		int[] yx = new int[10000];
		int i;
		double[] xl = new double[10000];
		double[] cha = new double[10000];
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
				bl[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				yx[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			xl[i] = (1.0 * yx[i]) / bl[i];
		}
		for (i = 1;i < n;i++)
		{
			cha[i] = xl[i] - xl[0];
		}
		for (i = 1;i < n;i++)
		{
			if (cha[i] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (cha[i] < -0.05)
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

