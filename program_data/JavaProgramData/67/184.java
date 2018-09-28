package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[500][2];
		int n;
		int i;
		int j;
		float a;
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
		a = ((float)(sz[0][1]) / (sz[0][0]));
		for (i = 1;i < n;i++)
		{
			if (((float)(sz[i][1]) / (sz[i][0])) < (a - 0.05))
			{
				System.out.print("worse\n");
			}
			else if (((float)(sz[i][1]) / (sz[i][0])) > (a + 0.05))
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

