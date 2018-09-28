package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sj = new int[1000][2];
		int i;
		float[] c = new float[1000];
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
				sj[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sj[i][1] = Integer.parseInt(tempVar3);
			}
			c[i] = (float)sj[i][1] / sj[i][0];
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] > c[0] && c[i] - c[0] > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (c[0] > c[i] && c[0] - c[i] > 0.05F)
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

