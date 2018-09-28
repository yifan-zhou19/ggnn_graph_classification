package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[][] point = new int[10][3];
		double[][] dis = new double[10][10];
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
				point[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				point[i][2] = Integer.parseInt(tempVar4);
			}
		}
	//	for(i=0;i<n;i++)
	//		printf("%d %d %d\n",point[i][0],point[i][1],point[i][2]);

		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[i][j] = (point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]);
			}
		}
		for (k = n * (n - 1) / 2;k > 0;k--)
		{
			double max = 0;
			int s;
			int t;
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (dis[i][j] > max)
					{
						max = dis[i][j];
						s = i;
						t = j;
					}
				}
			}
			max = Math.sqrt(max);
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",point[s][0],point[s][1],point[s][2],point[t][0],point[t][1],point[t][2],max);
			dis[s][t] = 0;
		}
	}

}

