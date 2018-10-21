package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] zong = new int[100];
		int[] yx = new int[100];
		int i;
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
				zong[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				yx[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			if ((double)yx[0] / zong[0] - (double)yx[i] / zong[i] >= 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((double)yx[i] / zong[i] - (double)yx[0] / zong[0] <= 0.05)
			{
				System.out.print("same\n");
			}
			else
			{
				System.out.print("better\n");
			}
		}
		return 0;
	}

}

