package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct point
	//{
	//	int x;
	//	int y;
	//	int z;
	//}
	//point[10];
	for (i = 0;i < n;i++)
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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct len
	//{
	//  double s;
	//  struct point p1,p2;
	//}
	//len[45];
	int k = 0;
	for (j = 0;j < n - 1;j++)
	{
		for (i = j + 1;i < n;i++)
		{
			len[k].s = Math.sqrt((point[j].x - point[i].x) * (point[j].x - point[i].x) + (point[j].y - point[i].y) * (point[j].y - point[i].y) + (point[j].z - point[i].z) * (point[j].z - point[i].z));
			len[k].p1.x = point[j].x;
			len[k].p1.y = point[j].y;
			len[k].p1.z = point[j].z;
			len[k].p2.x = point[i].x;
			len[k].p2.y = point[i].y;
			len[k].p2.z = point[i].z;
			k++;
		}
	}
	double e;
	int f;
	int g;
	int h;
	int l;
	int m;
	int o;
	for (j = 1;j <= k;j++)
	{
		for (i = k - 1;i > j - 1;i--)
		{
			if (len[i - 1].s < len[i].s)
			{
				e = len[i - 1].s;
				f = len[i - 1].p1.x;
				g = len[i - 1].p2.x;
				h = len[i - 1].p1.y;
				l = len[i - 1].p2.y;
				m = len[i - 1].p1.z;
				o = len[i - 1].p2.z;
				len[i - 1].s = len[i].s;
				len[i - 1].p1.x = len[i].p1.x;
				len[i - 1].p2.x = len[i].p2.x;
				len[i - 1].p1.y = len[i].p1.y;
				len[i - 1].p2.y = len[i].p2.y;
				len[i - 1].p1.z = len[i].p1.z;
				len[i - 1].p2.z = len[i].p2.z;
				len[i].s = e;
				len[i].p1.x = f;
				len[i].p2.x = g;
				len[i].p1.y = h;
				len[i].p2.y = l;
				len[i].p1.z = m;
				len[i].p2.z = o;
			}
		}
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",len[i].p1.x,len[i].p1.y,len[i].p1.z,len[i].p2.x,len[i].p2.y,len[i].p2.z,len[i].s);
	}
	  return 0;
	}
}

