package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		double[][] dot = new double[100][2];
		double distf = 0;
		double ld = 0;
		double dist = 0;
		double x;
		double y;
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
					dot[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
			for (i = 0;i < n - 1;i++)
			{
				for (k = i + 1;k < n;k++)
				{
					x = dot[i][0] - dot[k][0];
					y = dot[i][1] - dot[k][1];
					distf = x * x + y * y;
					dist = Math.sqrt(distf);
					if (dist > ld)
					{
					ld = dist;
					}
				}
			}
			System.out.printf("%.4f\n",ld);
	}




}

