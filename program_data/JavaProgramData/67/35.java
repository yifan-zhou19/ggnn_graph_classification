package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int jiu1;
		int jiu2;
		int[] xin1 = new int[100];
		int[] xin2 = new int[100];
		int[] xiao = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jiu1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			jiu2 = Integer.parseInt(tempVar3);
		}
		xiao[0] = 100 * jiu2 / jiu1;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				xin1[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				xin2[i] = Integer.parseInt(tempVar5);
			}
			xiao[i] = 100 * xin2[i] / xin1[i];
			if (xiao[i] - xiao[0] >= 5)
			{
				System.out.print("better\n");
			}
			else if (xiao[0] - xiao[i] >= 5)
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

