package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[][] sz = new float[100][3];
		for (int a = 0;a < n;a++)
		{
			for (int j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[a][j] = Float.parseFloat(tempVar2);
				}
			}
		}
		for (int i = 1;i < n;i++)
		{
				if (sz[i][1] / sz[i][0] - sz[0][1] / sz[0][0] > 0.05F)
				{
					System.out.print("better\n");
				}
				if (sz[i][1] / sz[i][0] - sz[0][1] / sz[0][0] < -0.05F)
				{
					System.out.print("worse\n");
				}
				if (sz[i][1] / sz[i][0] - sz[0][1] / sz[0][0] >= -0.05F && sz[i][1] / sz[i][0] - sz[0][1] / sz[0][0] <= 0.05F)
				{
					System.out.print("same\n");
				}
		}
		return 0;
	}
}

