public class pl
{
	public float[] s = new float[3];
}
public class place
{
	public pl y = new pl();
	public pl x = new pl();
	public float p;
}

package <missing>;

public class GlobalMembers
{
	public static pl[] p = tangible.Arrays.initializeWithDefaultplInstances(10);
	public static place[] q = tangible.Arrays.initializeWithDefaultplaceInstances(45);
	public static place qx = new place();
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		int l;
		int r;
		int v;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n * (n - 1) / 2;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].s[0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].s[1] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p[i].s[2] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: q[k].y=p[i];
				q[k].y.copyFrom(p[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: q[k].x=p[j];
				q[k].x.copyFrom(p[j]);
				q[k].p = Math.sqrt((p[i].s[0] - p[j].s[0]) * (p[i].s[0] - p[j].s[0]) + (p[i].s[1] - p[j].s[1]) * (p[i].s[1] - p[j].s[1]) + (p[i].s[2] - p[j].s[2]) * (p[i].s[2] - p[j].s[2]));
				k++;
			}
		}
		for (l = 0;l <= m - 1;l++)
		{
			for (r = 0;r <= m - 1 - l;r++)
			{
				if (q[r].p < q[r + 1].p)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: qx=q[r];
					qx.copyFrom(q[r]);
					q[r] = q[r + 1];
					q[r + 1] = qx;
				}
			}
		}
		for (v = 0;v <= m - 1;v++)
		{
			System.out.printf("(%g,%g,%g)-(%g,%g,%g)=%.2lf\n",q[v].y.s[0],q[v].y.s[1],q[v].y.s[2],q[v].x.s[0],q[v].x.s[1],q[v].x.s[2],q[v].p);
		}
	}
}

