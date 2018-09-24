package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] sz = new int[200][2];
		int[] jg = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
			jg[i] = sz[i][1] * 100 / sz[i][0];
		}
		for (i = 1;i < n;i++)
		{
			if (jg[i] - jg[0] >= 5)
			{
				System.out.print("better\n");
			}
			else
			{
				if (jg[0] - jg[i] >= 5)
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

