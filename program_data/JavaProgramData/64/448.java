package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] point = new int[11][3];
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					point[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		double[][] distance = new double[15][15];
		double s;
		for (int i = 0;i < n;i++)
		{
			for (int k = 1;i + k < n;k++)
			{
				s = Math.sqrt((point[i][0] - point[i + k][0]) * (point[i][0] - point[i + k][0]) + (point[i][1] - point[i + k][1]) * (point[i][1] - point[i + k][1]) + (point[i][2] - point[i + k][2]) * (point[i][2] - point[i + k][2]));
				distance[i][i + k] = s;
			}
		}
		double[] lenth = new double[105];
		int[][] id = new int[105][2];
		int k = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (distance[i][j] == 0)
				{
				   continue;
				}
				id[k][0] = i;
				id[k][1] = j;
				lenth[k] = distance[i][j];
				k++;
			}
		}
		double e;
		for (int p = 1;p < k;p++)
		{
			for (int i = k - 1;i >= p;i--)
			{
				if (lenth[i] > lenth[i - 1])
				{
				   e = id[i][0];
				   id[i][0] = id[i - 1][0];
				   id[i - 1][0] = e;
				   e = id[i][1];
				   id[i][1] = id[i - 1][1];
				   id[i - 1][1] = e;
				   e = lenth[i];
				   lenth[i] = lenth[i - 1];
				   lenth[i - 1] = e;
				}
			}
		}
		for (int i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",point[id[i][0]][0],point[id[i][0]][1],point[id[i][0]][2],point[id[i][1]][0],point[id[i][1]][1],point[id[i][1]][2],lenth[i]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

