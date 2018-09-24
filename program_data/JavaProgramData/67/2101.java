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
		int[][] haart = new int[1000][2];
		for (i = 0;i <= n - 1;i++)
		{
			for (k = 0;k <= 1;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(haart[i][k]) = Integer.parseInt(tempVar2);
				}
			}
		}
		float sta;
		sta = (float)haart[0][1] / (float)haart[0][0];
		float cmp;
		for (i = 1;i <= n - 1;i++)
		{
			cmp = (float)haart[i][1] / (float)haart[i][0];
			if (sta - cmp > 0.05F)
			{
				System.out.print("worse\n");
			}
			else if (cmp - sta > 0.05F)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

