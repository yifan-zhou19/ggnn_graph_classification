public class point
{
	public int x;
	public int y;
	public int z;
}
public class jl
{
	public int c;
	public int d;
	public float f;
}

package <missing>;

public class GlobalMembers
{
	public static point[] point = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static jl[] jl = tangible.Arrays.initializeWithDefaultjlInstances(45);
	public static int Main()
	{
		int n;
		int i;
		int j;
		jl t = new jl();
		float juli = new float(struct point a,struct point b);
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
				point[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				point[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				jl[n * i - i * (i + 1) / 2 + j - i - 1].f = juli(point[i], point[j]);
				jl[n * i - i * (i + 1) / 2 + j - i - 1].c = i;
				jl[n * i - i * (i + 1) / 2 + j - i - 1].d = j;
			}
		}
		for (j = 1;j < n * (n - 1) / 2;j++)
		{
			for (i = 0;i < n * (n - 1) / 2 - j;i++)
			{
				if (jl[i].f < jl[i + 1].f)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=jl[i];
					t.copyFrom(jl[i]);
					jl[i] = jl[i + 1];
					jl[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",point[jl[i].c].x,point[jl[i].c].y,point[jl[i].c].z,point[jl[i].d].x,point[jl[i].d].y,point[jl[i].d].z,jl[i].f);
		}
		return 0;
	}
	public static float juli(point a, point b)
	{
		float k;
		k = Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) * (a.z - b.z));
		return k;
	}

}

