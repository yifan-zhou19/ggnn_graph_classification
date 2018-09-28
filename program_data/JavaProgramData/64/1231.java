package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
		p[10]; //?????
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distant
	//	{
	//		float d;
	//		struct point p1;
	//		struct point p2;
	//	}
		dis[45],temp; //????
		int n;
		int i;
		int j;
		int k;
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
				p[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].z = tempVar4;
			}
		}
		i = 0;
		for (j = 0;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				dis[i].p1 = p[j];
				dis[i].p2 = p[k];
				i = i + 1;
			}
		} //???????????????????????????
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			dis[i].d = Math.sqrt((dis[i].p1.x - dis[i].p2.x) * (dis[i].p1.x - dis[i].p2.x) + (dis[i].p1.y - dis[i].p2.y) * (dis[i].p1.y - dis[i].p2.y) + (dis[i].p1.z - dis[i].p2.z) * (dis[i].p1.z - dis[i].p2.z));
		} //?????????
		for (i = 1;i < n * (n - 1) / 2;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - i;j++)
			{
				if (dis[j].d < dis[j + 1].d)
				{
					temp = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = temp;
				}
			}
		} //??????????????????????????
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",dis[i].p1.x,dis[i].p1.y,dis[i].p1.z,dis[i].p2.x,dis[i].p2.y,dis[i].p2.z,dis[i].d);
		}
		return 0;
	}

}

