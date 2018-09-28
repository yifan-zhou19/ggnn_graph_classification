package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zb
	//	{
	//		int x,y,z;
	//	}
	//	zb[1000];
		for (q = 0;q < n;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(zb[q].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(zb[q].y) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(zb[q].z) = tempVar4;
			}
		}
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct jl
	//	{
	//		int x1,x2,y1,y2,z1,z2;
	//		double s;
	//	}
	//	jl[1000];
		for (q = 0;q < n - 1;q++)
		{
			for (j = q + 1;j < n;j++)
			{
				jl[i].x1 = zb[q].x;
				jl[i].x2 = zb[j].x;
				jl[i].y1 = zb[q].y;
				jl[i].y2 = zb[j].y;
				jl[i].z1 = zb[q].z;
				jl[i].z2 = zb[j].z;
				int a;
				int b;
				int c;
				double f;
				a = jl[i].x1 - jl[i].x2;
				b = jl[i].y1 - jl[i].y2;
				c = jl[i].z1 - jl[i].z2;
				f = a * a + b * b + c * c;
				jl[i].s = Math.sqrt(f);
				i++;
			}
		}
		int m;
		m = i;
		for (q = 1;q <= m;q++)
		{
			for (j = 0;j < m - q;j++)
			{
				if ((jl[j + 1].s) > (jl[j].s))
				{
					jl[1000] = jl[j + 1];
					jl[j + 1] = jl[j];
					jl[j] = jl[1000];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",jl[i].x1,jl[i].y1,jl[i].z1,jl[i].x2,jl[i].y2,jl[i].z2,jl[i].s);
		}
		return 0;
	}
}

