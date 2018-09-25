package <missing>;

public class GlobalMembers
{
	public static double length(double x1,double y1,double x2,double y2)
	{
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	public static void Main()
	{
		double length = new double(double,double,double,double);
		double[][] num = new double[100][2];
		double max;
		double temp;
		int n;
		int i;
		int j;
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
				num[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i][1] = Double.parseDouble(tempVar3);
			}
		}
		max = length(num[0][0], num[1][0], num[0][1], num[1][1]);
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (max < (temp = length(num[i][0], num[i][1], num[j][0], num[j][1])))
				{
					max = temp;
				}
			}
		}
			System.out.printf("%.4f\n",max);
	}
}

