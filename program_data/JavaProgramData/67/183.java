package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sz = new int[1000];
		int[] sx = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double sum;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sx[i] = Integer.parseInt(tempVar3);
			}


		}
		for (j = 1;j < n;j++)
		{
			if (((double)sx[j] / (double)sz[j] - (double)sx[0] / (double)sz[0]) > 0.05)
			{
				System.out.print("better\n");
			}
			else if (((double)sx[0] / (double)sz[0] - (double)sx[j] / (double)sz[j]) > 0.05)
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

