package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	p[10];
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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distant
	//	{
	//		struct point p1,p2;
	//		double r;
	//	}
	//	d[45],t;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++,k++)
			{
				d[k].p1 = p[i];
				d[k].p2 = p[j];
				d[k].r = Math.sqrt(1.0 * ((d[k].p1.x - d[k].p2.x) * (d[k].p1.x - d[k].p2.x) + (d[k].p1.y - d[k].p2.y) * (d[k].p1.y - d[k].p2.y) + (d[k].p1.z - d[k].p2.z) * (d[k].p1.z - d[k].p2.z)));
				if (k > n * (n - 1) / 2)
				{
					break;
				}
			}
			if (k > n * (n - 1) / 2)
			{
				break;
			}
		}

		for (i = k - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (d[j].r < d[j + 1].r)
				{
					t = d[j];
					d[j] = d[j + 1];
					d[j + 1] = t;
				}

			}

		}
		 for (i = 0;i < k;i++)
		 {
			 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",d[i].p1.x,d[i].p1.y,d[i].p1.z,d[i].p2.x,d[i].p2.y,d[i].p2.z,d[i].r);
		 }
		 return 0;
	}



}

