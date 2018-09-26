package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] num = new double[10][2];
		double a = 0;
		double b;
		double dis;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				num[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b = Math.sqrt((num[j][0] - num[i][0]) * (num[j][0] - num[i][0]) + (num[j][1] - num[i][1]) * (num[j][1] - num[i][1]));
				if (b < a)
				{
					dis = a;
				}
				if (b >= a)
				{
					dis = b;
					a = b;
				}

			}
		}
		System.out.printf("%.4f",dis);
		return 0;
	}

}

