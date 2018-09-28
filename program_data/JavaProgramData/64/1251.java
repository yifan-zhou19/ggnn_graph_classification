package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x,y,z;
	//	};
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(10);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		struct point p1;
	//		struct point p2;
	//		float dis;
	//	};
		distance[] d = tangible.Arrays.initializeWithDefaultdistanceInstances(45);
		distance temp = new distance();
		int i;
		int n;
		int j;
		int k;
		float pf;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			d[k].p1 = p[i];
			d[k].p2 = p[j];
			pf = (float)(p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y) + (p[i].z - p[j].z) * (p[i].z - p[j].z);
			d[k].dis = Math.sqrt(pf);
			k++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - i;j++)
			{
				if (d[j].dis < d[j + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[j];
					temp.copyFrom(d[j]);
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",d[i].p1.x,d[i].p1.y,d[i].p1.z,d[i].p2.x,d[i].p2.y,d[i].p2.z,d[i].dis);
		}
		return 0;
	}

}

