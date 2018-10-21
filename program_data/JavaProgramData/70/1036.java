package <missing>;

public class GlobalMembers
{
	//struct
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double l;
		double max;

		double[][] d = new double[100][3];
		for (int i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (int i = 0;i < k;i++)
		{
			max = 0;
			for (int j = i + 1;j < k;j++)
			{
				l = (d[i][0] - d[j][0]) * (d[i][0] - d[j][0]) + (d[i][1] - d[j][1]) * (d[i][1] - d[j][1]);
				if (l > max)
				{
				max = l;
				}
			}
			d[i][2] = max;
			max = 0;
		}
		for (int i = 0;i < k;i++)
		{
			if (d[i][2] > max)
			{
			max = d[i][2];
			}
		}
		System.out.printf("%.4f",Math.sqrt(max));
	}

}

