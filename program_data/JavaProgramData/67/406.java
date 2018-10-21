package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float a;
		float b;
		int[][] sz = new int[100][2];
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
		}
		a = (float)sz[0][1] / sz[0][0];
		for (i = 1;i < n;i++)
		{
			b = (float)sz[i][1] / sz[i][0];
			if (a - b > 0.05F)
			{
				System.out.print("worse\n");
				continue;
			}
			if (b - a > 0.05F)
			{
				System.out.print("better\n");
				continue;
			}
			else
			{
				System.out.print("same\n");
				continue;
			}
		}
		return 0;
	}
}

