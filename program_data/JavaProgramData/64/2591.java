package <missing>;

public class GlobalMembers
{
	public static double distance(int xa, int ya, int za, int xb, int yb, int zb)
	{
		int sum;
		double dis;
		sum = (xb - xa) * (xb - xa) + (yb - ya) * (yb - ya) + (zb - za) * (zb - za);
		dis = Math.sqrt(sum);
		return dis;
	}

	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		int b = 0;
		int w = 0;
		int te;
		double td;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x,y,z;
	//	}
	//	point[10];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			point[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			point[i].y = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			point[i].z = tempVar4;
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int p,q;
	//		double dist;
	//	}
	//	temp[45];
		for (i = 0;i < 45;i++)
		{
		temp[i].dist = -1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				temp[w].p = i;
				temp[w].q = j;
				temp[w].dist = distance(point[i].x, point[i].y, point[i].z, point[j].x, point[j].y, point[j].z);
				w = w + 1;
			}
		}

	for (i = 0;i < 45;i++)
	{
		for (w = 0;w < 44;w++)
		{
			if (temp[w].dist < temp[w + 1].dist)
			{
				te = temp[w + 1].p;
				temp[w + 1].p = temp[w].p;
				temp[w].p = te;
				te = temp[w + 1].q;
				temp[w + 1].q = temp[w].q;
				temp[w].q = te;
				td = temp[w + 1].dist;
				temp[w + 1].dist = temp[w].dist;
				temp[w].dist = td;
			}
		}
	}


	for (w = 0;w < 45;w++)
	{

	if (temp[w].dist != -1)
	{
		System.out.printf("(%d,%d,%d)-",point[temp[w].q].x,point[temp[w].q].y,point[temp[w].q].z);
		System.out.printf("(%d,%d,%d)=",point[temp[w].p].x,point[temp[w].p].y,point[temp[w].p].z);
		System.out.printf("%.2lf\n",temp[w].dist);
	}
	}
		return 0;
	}



}

