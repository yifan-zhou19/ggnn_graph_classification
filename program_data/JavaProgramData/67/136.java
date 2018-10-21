package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int jwjzsh;
		int jwjyx;
		int[] zsh = new int[100];
		int[] yx = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jwjzsh = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			jwjyx = Integer.parseInt(tempVar3);
		}
		double rate0;
		rate0 = 1.0 * jwjyx / jwjzsh;
		double[] rate = new double[100];
		int i;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zsh[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				yx[i] = Integer.parseInt(tempVar5);
			}
			rate[i] = 1.0 * yx[i] / zsh[i];
			double ch;
			ch = rate[i] - rate0;
			if (ch >= 0.05)
			{
				System.out.print("better\n");
			}
			else if (ch >= -0.05 && ch <= 0.05)
			{
				System.out.print("same\n");
			}
			else if (ch <= -0.05)
			{
				System.out.print("worse\n");
			}
		}
		return 0;
	}
}

