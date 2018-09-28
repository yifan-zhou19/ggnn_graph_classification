public class point
{
	public int x;
	public int y;
	public int z;
}
public class diskumi
{
	public point po1 = new point();
	public point po2 = new point();
	public double dist;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xa = new int[15];
		int[] ya = new int[15];
		int[] za = new int[15];
		diskumi[] dis = tangible.Arrays.initializeWithDefaultdiskumiInstances(45);
		int baka;
		double cir;
		int i;
		int j;
		int k = 0;
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
				xa[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ya[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				za[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[k].po1.x = xa[i];
				dis[k].po1.y = ya[i];
				dis[k].po1.z = za[i];
				dis[k].po2.x = xa[j];
				dis[k].po2.y = ya[j];
				dis[k].po2.z = za[j];
				dis[k].dist = Math.sqrt((xa[i] - xa[j]) * (xa[i] - xa[j]) + (ya[i] - ya[j]) * (ya[i] - ya[j]) + (za[i] - za[j]) * (za[i] - za[j]));
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (dis[j + 1].dist > dis[j].dist)
				{
					baka = dis[j].po1.x;
					dis[j].po1.x = dis[j + 1].po1.x;
					dis[j + 1].po1.x = baka;
					baka = dis[j].po1.y;
					dis[j].po1.y = dis[j + 1].po1.y;
					dis[j + 1].po1.y = baka;
					baka = dis[j].po1.z;
					dis[j].po1.z = dis[j + 1].po1.z;
					dis[j + 1].po1.z = baka;

					baka = dis[j].po2.x;
					dis[j].po2.x = dis[j + 1].po2.x;
					dis[j + 1].po2.x = baka;
					baka = dis[j].po2.y;
					dis[j].po2.y = dis[j + 1].po2.y;
					dis[j + 1].po2.y = baka;
					baka = dis[j].po2.z;
					dis[j].po2.z = dis[j + 1].po2.z;
					dis[j + 1].po2.z = baka;

					cir = dis[j].dist;
					dis[j].dist = dis[j + 1].dist;
					dis[j + 1].dist = cir;
				}
			}
		}
		k--;
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf",dis[0].po1.x,dis[0].po1.y,dis[0].po1.z,dis[0].po2.x,dis[0].po2.y,dis[0].po2.z,dis[0].dist);
		for (i = 1;i <= k;i++)
		{
			System.out.printf("\n(%d,%d,%d)-(%d,%d,%d)=%.2lf",dis[i].po1.x,dis[i].po1.y,dis[i].po1.z,dis[i].po2.x,dis[i].po2.y,dis[i].po2.z,dis[i].dist);
		}
	}
}

