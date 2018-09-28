package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] all = new int[100];
		int[] health = new int[100];
		double[] rate = new double[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				all[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				health[i] = Integer.parseInt(tempVar3);
			}
			rate[i] = 1.0 * health[i] / all[i];
		}
		for (i = 1;i < n - 1;i++)
		{
			if (rate[i] > rate[0] + 0.05)
			{
				System.out.print("better\n");
			}
			else if (rate[i] < rate[0] - 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
			if (rate[n - 1] > rate[0] + 0.05)
			{
				System.out.print("better");
			}
			else if (rate[n - 1] < rate[0] - 0.05)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}

		return 0;
	}

}

