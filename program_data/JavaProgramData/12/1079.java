package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[100][16];
		int[] sum = new int[100];
		float y;
		int i;
		int j;
		int k;
		for (j = 0;j < 100;j++)
		{
			for (i = 0;i < 16;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[j][i] = Integer.parseInt(tempVar);
				}
					if (x[j][0] == -1)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
					if (x[j][i] == 0)
					{
						break;
					}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (j = 0;j < 100;j++)
	{
				if (x[j][0] != -1)
				{
				for (i = 0;i < 16;i++)
				{
					if (x[j][i] == 0)
					{
						break;
					}
					for (k = 0;k < 16;k++)
					{
					if (x[j][k] == 0)
					{
						 break;
					}
					y = 1.0 * x[j][i] / (1.0 * x[j][k]);
					if (y == 2F)
					{
						sum[j] = sum[j] + 1;
					}
					}
				}
				System.out.printf("%d\n",sum[j]);
				}
		if (x[j][0] == -1)
		{
					break;
		}

	}
		return 0;
	}
}

