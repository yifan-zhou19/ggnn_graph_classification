package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct _Point
	//	{
	//		int x,y,z;
	//	};
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct _Distance
	//	{
	//		int first, second;
	//		float dist;
	//	};
		_Point[] point = tangible.Arrays.initializeWithDefault_PointInstances(10);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		int total = n * (n - 1) >> 1;
		n--;
		for (i = 0; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				point[i].z = tempVar4;
			}
		}
		_Distance[] pDistance = tangible.Arrays.initializeWithDefault_DistanceInstances(total);
		int k = 0;
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				pDistance[k].first = i;
				pDistance[k].second = j;
				pDistance[k].dist = Math.sqrt((float)((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z)));
				k++;
			}
		}
		for (i = 1; i < total; i++)
		{
			int tmp = total - i;
			for (j = 0; j < tmp; j++)
			{
				if (pDistance[j].dist < pDistance[j + 1].dist)
				{
					_Distance tmp = pDistance[j];
					pDistance[j] = pDistance[j + 1];
					pDistance[j + 1] = tmp;
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", point[pDistance[i].first].x, point[pDistance[i].first].y, point[pDistance[i].first].z, point[pDistance[i].second].x, point[pDistance[i].second].y, point[pDistance[i].second].z, pDistance[i].dist);
		}
		pDistance = null;
		return 0;
	}
}

