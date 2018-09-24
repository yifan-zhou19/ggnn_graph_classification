package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] zong = new int[100];
		int[] you = new int[100];
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
				you[i] = Integer.parseInt(tempVar3);
			}
			if (i >= 1)
			{
				if (you[i] * 1.0 / zong[i] - you[0] * 1.0 / zong[0] > 0.05)
				{
					System.out.print("better\n");
				}
				else if (you[0] * 1.0 / zong[0] - you[i] * 1.0 / zong[i] > 0.05)
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

