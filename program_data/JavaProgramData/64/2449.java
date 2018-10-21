package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][3];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//	int x1,x2,y1,y2,z1,z2;
	//	double d;
	//	}
	//	dis[45],mid;
		int m = 0;
		for (int k = 0;k < n - 1;k++)
		{
			for (int l = k + 1;l < n;l++)
			{
				dis[m].x1 = a[k][0];
				dis[m].x2 = a[l][0];
				dis[m].y1 = a[k][1];
				dis[m].y2 = a[l][1];
				dis[m].z1 = a[k][2];
				dis[m].z2 = a[l][2];
				dis[m].d = Math.sqrt((dis[m].x1 - dis[m].x2) * (dis[m].x1 - dis[m].x2) + (dis[m].y1 - dis[m].y2) * (dis[m].y1 - dis[m].y2) + (dis[m].z1 - dis[m].z2) * (dis[m].z1 - dis[m].z2));
				m++;
			}
		}



	for (int j = 1 ; j <= m ; j++)
	{
		for (int p = 0; p < m - j; p++)
		{
				if (dis[p].d < dis[p + 1].d)
				{
						mid = dis[p + 1];
						dis[p + 1] = dis[p];
						dis[p] = mid;
				}
		}
	}






	for (int w = 0;w < m;w++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",dis[w].x1,dis[w].y1,dis[w].z1,dis[w].x2,dis[w].y2,dis[w].z2,dis[w].d);
	}
	return 0;
	}

}

