package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] yx = new double[n];
		for (i = 0;i < n;i++)
		{
		int[] sz = new int[2];
		for (k = 0;k < 2;k++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[k] = Integer.parseInt(tempVar2);
		}
		}
		yx[i] = (double)sz[1] / sz[0];
		}
		for (i = 1;i < n;i++)
		{
			if (yx[i] - yx[0] > 0.05)
			{
		System.out.print("better\n");
			}
			else if (yx[0] - yx[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(yx);
		return 0;

	}
}

