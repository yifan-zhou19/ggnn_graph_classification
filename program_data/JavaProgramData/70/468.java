package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[10][2];
		int n;
		int i;
		int j;
		double x;
		double y;
		double[][] l = new double[10][10];
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
				l[i][j] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
			}
		}
	   for (i = 0;i < n;i++)
	   {
			for (j = i + 1;j < n;j++)
			{

			   if (l[i][j] >= max)
			   {
				   max = l[i][j];
			   }
			}
	   }
			System.out.printf("%.4lf\n",max);
		   return 0;
	}

}

