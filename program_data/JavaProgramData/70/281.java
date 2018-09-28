package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		float[][] a = new float[20][2];
		double[][] dis = new double[20][20];
		double max;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i][j] = Float.parseFloat(tempVar2);
			  }
			}
		}

			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					dis[i][j] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				}
			}


		 max = dis[0][0];

		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				 if (dis[i][j] >= max)
				 {
					 max = dis[i][j];
				 }
			 }
		 }

				 System.out.printf("%.4lf\n",max);
	}
}

