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

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct coordinate
	//	{
	//		int x;
	//		int y;
	//		int z;
	//		int io;
	//	}
	//	pt[n];
		int i;
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(pt[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(pt[i].y) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(pt[i].z) = tempVar4;
			}
			pt[i].io = i;
		}

		int j;
		int m;
		m = n * (n - 1) / 2; //?????

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		struct coordinate pt1;
	//		struct coordinate pt2;
	//		double l;
	//	}
	//	dist[m];

	   int t = 0;

		for (i = 0;i < n;i = i + 1)
		{
			for (j = i + 1;j < n;j = j + 1)
			{
				dist[t].pt1 = pt[i];
				dist[t].pt2 = pt[j];
				dist[t].l = Math.sqrt(Math.pow(1.0 * (dist[t].pt1.x - dist[t].pt2.x),2.0) + Math.pow(1.0 * (dist[t].pt1.y - dist[t].pt2.y),2.0) + Math.pow(1.0 * (dist[t].pt1.z - dist[t].pt2.z),2.0));
				t = t + 1;
			}
		}

		distance temp = new distance();

		int s = 0;

		while (s == 0)
		{
			s = 1;
			for (i = 0;i < m - 1;i++)
			{
				if (dist[i].l < dist[i + 1].l)
				{
					temp = dist[i];
					dist[i] = dist[i + 1];
					dist[i + 1] = temp;
					s = 0;

				}
			}
		}


		for (i = 0;i < m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",dist[i].pt1.x,dist[i].pt1.y,dist[i].pt1.z,dist[i].pt2.x,dist[i].pt2.y,dist[i].pt2.z,dist[i].l);
		}




		return (0);


	}

}

