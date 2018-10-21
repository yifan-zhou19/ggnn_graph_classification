package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		double dis = 0.0;
		double dis1 = 0.0;
		double[][] poi = new double[100][2];
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
				poi[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				poi[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (t = i + 1;t < n;t++)
			{
				dis1 = Math.pow((poi[i][0] - poi[t][0]) * (poi[i][0] - poi[t][0]) + (poi[i][1] - poi[t][1]) * (poi[i][1] - poi[t][1]),0.5);
				if (dis1 > dis)
				{
					dis = dis1;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.printf("%.4f\n",dis);
		return 0;
	}
}

