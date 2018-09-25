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
		float[][] x = new float[10000][2];
		int i;
		int j;
		float dis = 0F;
		float b;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][1] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b = (float)Math.sqrt((x[i][0] - x[j][0]) * (x[i][0] - x[j][0]) + (x[i][1] - x[j][1]) * (x[i][1] - x[j][1]));
				if (b >= dis)
				{
					dis = b;
				}
				else
				{
					dis = dis;
				}
			}
		}
		System.out.printf("%.4f\n",dis);
		return 0;
	}

}

