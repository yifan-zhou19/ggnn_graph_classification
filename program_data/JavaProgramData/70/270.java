package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double[][] point = new double[100][2];
		double s;
		double max = 0;
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
				point[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				s = Math.sqrt(Math.pow(point[i][0] - point[k][0],2) + Math.pow(point[i][1] - point[k][1],2));
				if (s > max)
				{
					max = s;
				}
			}
		}
		System.out.printf("%.4f\n",max);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;

	}
}

