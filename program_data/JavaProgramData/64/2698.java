package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][3];
		int m;
		int i;
		int j;
		int k = 0;
		int[][] dis = new int[100][2];
		int[] b = new int[100];
		int temp;
		int x;
		int y;
		int z;
		double[] distance = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				x = a[i][0] - a[j][0];
				y = a[i][1] - a[j][1];
				z = a[i][2] - a[j][2];
				temp = Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2);
				distance[k] = Math.sqrt(temp);
				b[k] = k;
				dis[k][0] = i;
				dis[k][1] = j;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (distance[b[i]] < distance[b[j]])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
				else if (distance[b[i]] == distance[b[j]])
				{
					if (dis[b[i]][0] > dis[b[j]][0])
					{
						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
					else if (dis[b[i]][0] == dis[b[j]][0] && dis[b[i]][1] > dis[b[j]][1])
					{
						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[dis[b[i]][0]][0],a[dis[b[i]][0]][1],a[dis[b[i]][0]][2],a[dis[b[i]][1]][0],a[dis[b[i]][1]][1],a[dis[b[i]][1]][2],distance[b[i]]);
		}
		return 0;
	}
}

