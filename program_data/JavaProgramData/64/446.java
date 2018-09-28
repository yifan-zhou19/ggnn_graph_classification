package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct info1
	//	{
	//		int a[3];
	//	}
	//	point[N];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct info2
	//	{
	//		int f[3],l[3];
	//		double result;
	//	}
	//	dist[N*(N-1)/2];
		int n;
		int i;
		int j;
		int k = 0;
		int p;
		double tmpdist;
		int tmppoint;
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
				point[i].a[0] = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i].a[1] = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				point[i].a[2] = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dist[k].result = Math.sqrt((double)(point[i].a[0] - point[j].a[0]) * (point[i].a[0] - point[j].a[0]) + (point[i].a[1] - point[j].a[1]) * (point[i].a[1] - point[j].a[1]) + (point[i].a[2] - point[j].a[2]) * (point[i].a[2] - point[j].a[2]));
				for (p = 0;p < 3;p++)
				{
					dist[k].f[p] = point[i].a[p];
					dist[k].l[p] = point[j].a[p];
				}
				k++;
			}
		}
		for (j = 1;j < k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (dist[i].result < dist[i + 1].result)
				{
					tmpdist = dist[i].result;
					dist[i].result = dist[i + 1].result;
					dist[i + 1].result = tmpdist;
					for (p = 0;p < 3;p++)
					{
						tmppoint = dist[i].f[p];
						dist[i].f[p] = dist[i + 1].f[p];
						dist[i + 1].f[p] = tmppoint;
						tmppoint = dist[i].l[p];
						dist[i].l[p] = dist[i + 1].l[p];
						dist[i + 1].l[p] = tmppoint;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",dist[i].f[0],dist[i].f[1],dist[i].f[2],dist[i].l[0],dist[i].l[1],dist[i].l[2],dist[i].result);
		}
		return 0;
	}
}

