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
		float[][] sz = new float[100][2];
		float[] q = new float[100];

		int i;
		int k;

		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][k] = Float.parseFloat(tempVar2);
				}
			}
			q[i] = 0F;
			q[i] = sz[i][1] / sz[i][0];
		}
		for (i = 1;i < n;i++)
		{
			if (q[0] - q[i] > 0.05f)
			{
				System.out.print("worse\n");
			}
			if (q[i] - q[0] > 0.05f)
			{
				System.out.print("better\n");
			}
			if ((q[0] - q[i] <= 0.05f) && (q[i] - q[0] <= 0.05f))
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}


}

