package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double temp = 0;
		double sum = 0;
		double[][] pt = new double[256][2];
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
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
				pt[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pt[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < n;k++)
			{
				temp = (pt[j][0] - pt[k][0]) * (pt[j][0] - pt[k][0]) + (pt[j][1] - pt[k][1]) * (pt[j][1] - pt[k][1]);
				if (sum <= temp)
				{
					sum = temp;
				}
			}
		}
		sum = Math.pow(sum,0.5);
		System.out.printf("%.4lf",sum);
		return 0;
	}
}

