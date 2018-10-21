package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			double[] cd = new double[1000];
			double s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zuobiao
	//	{
	//		int x,y,z;
	//	}
	//	zuobiao[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct jl
	//	{
	//		int q,w,e,r,t,u;
	//	}
	//	jl[1000];
		int i;
		int j;
		int n;
		int k;
		int a;
		int b;
		int c;
		int d;
		int f;
		int g;
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
				(zuobiao[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(zuobiao[i].y) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(zuobiao[i].z) = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			   cd[k] = Math.sqrt((zuobiao[i].x - zuobiao[j].x) * (zuobiao[i].x - zuobiao[j].x) + (zuobiao[i].y - zuobiao[j].y) * (zuobiao[i].y - zuobiao[j].y) + (zuobiao[i].z - zuobiao[j].z) * (zuobiao[i].z - zuobiao[j].z));
			   jl[k].q = zuobiao[i].x;
	jl[k].w = zuobiao[i].y;
	jl[k].e = zuobiao[i].z;
	jl[k].r = zuobiao[j].x;
	jl[k].t = zuobiao[j].y;
	jl[k].u = zuobiao[j].z;
			   k = k + 1;
			}
		}
		for (j = 1;j <= k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (cd[i] < cd[i + 1])
				{
					s = cd[i];
					cd[i] = cd[i + 1];
					cd[i + 1] = s;
					a = jl[i].q;
	jl[i].q = jl[i + 1].q;
	jl[i + 1].q = a;
					b = jl[i].w;
	jl[i].w = jl[i + 1].w;
	jl[i + 1].w = b;
					c = jl[i].e;
	jl[i].e = jl[i + 1].e;
	jl[i + 1].e = c;
					d = jl[i].r;
	jl[i].r = jl[i + 1].r;
	jl[i + 1].r = d;
					f = jl[i].t;
	jl[i].t = jl[i + 1].t;
	jl[i + 1].t = f;
					g = jl[i].u;
	jl[i].u = jl[i + 1].u;
	jl[i + 1].u = g;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",jl[i].q,jl[i].w,jl[i].e,jl[i].r,jl[i].t,jl[i].u,cd[i]);
		}
		return 0;
	}
}

