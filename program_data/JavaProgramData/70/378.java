package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int num;
		double mid;
		double max = 0;
		float[][] point = new float[100][2];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i][1] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < num;i++)
		{
			for (j = i;j < num;j++)
			{
				mid = (point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]);
				if (mid > max)
				{
					max = mid;
				}
			}
		}
		System.out.printf("%.4lf\n",Math.sqrt(Math.abs(max)));
	}
}

