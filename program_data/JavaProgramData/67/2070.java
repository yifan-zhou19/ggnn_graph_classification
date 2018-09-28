package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double old;
		double xlf;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] zs = new int[n];
		int[] yx = new int[n];


		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				yx[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				old = (double)yx[i] / zs[i];
			}
			else
			{
				xlf = (double)yx[i] / zs[i];
				if (xlf - old > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else if (old - xlf > 0.05)
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}

			}
		}
	return 0;
	}
}

