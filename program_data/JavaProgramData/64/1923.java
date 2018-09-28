public class point
{
	public int[] x = new int[2];
	public int[] y = new int[2];
	public int[] z = new int[2];
	public float s;
}

package <missing>;

public class GlobalMembers
{
	public static point[] p = tangible.Arrays.initializeWithDefaultpointInstances(100);
	public static point q = new point();
	public static float distant(int x1,int y1, int z1,int x2,int y2,int z2)
	{
		float m;
		float e;
		e = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2);
		m = Math.sqrt(e);
		return (m);
	}

	public static int Main()
	{
		int n;
		int[] x = new int[11];
		int[] y = new int[11];
		int[] z = new int[11];
		int i;
		int j = 0;
		int[] s = new int[100];
		int k;
		int t = 1;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			p[i].x[0] = x[j];
			p[i].y[0] = y[j];
			p[i].z[0] = z[j];
			p[i].x[1] = x[j + t];
			p[i].y[1] = y[j + t];
			p[i].z[1] = z[j + t];
			t++;
			if (j + t > n - 1)
			{
				j++;
				t = 1;
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
				p[i].s = distant(p[i].x[0], p[i].y[0], p[i].z[0], p[i].x[1], p[i].y[1], p[i].z[1]);
		}
		for (k = 1;k <= n * (n - 1) / 2;k++)
		{
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
				if (p[i].s < p[i + 1].s)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: q=p[i];
					q.copyFrom(p[i]);
					p[i] = p[i + 1];
					p[i + 1] = q;
				}
		}
		}
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f",p[0].x[0],p[0].y[0],p[0].z[0],p[0].x[1],p[0].y[1],p[0].z[1],p[0].s);
		for (i = 1;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("\n(%d,%d,%d)-(%d,%d,%d)=%.2f",p[i].x[0],p[i].y[0],p[i].z[0],p[i].x[1],p[i].y[1],p[i].z[1],p[i].s);
		}
		return 0;
	}

}

