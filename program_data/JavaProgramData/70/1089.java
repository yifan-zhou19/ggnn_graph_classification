package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[100][2];
		int n;
		int i;
		int j;
		double x2;
		double y2;
		double distance = 0;
		double dis;
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
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
			   x2 = (a[j][0] - a[i][0]) * (a[j][0] - a[i][0]);
			   y2 = (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
			   dis = Math.sqrt(x2 + y2);
			   if (dis >= distance)
			   {
			   distance = dis;
			   }
		   }
		}
		 System.out.printf("%.4f",distance);

	}

}

