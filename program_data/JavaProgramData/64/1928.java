public class point
{
	public double x;
	public double y;
	public double z;
}

public class points
{
	public double x1;
	public double y1;
	public double z1;
	public double x2;
	public double y2;
	public double z2;
	public double len;
}

package <missing>;

public class GlobalMembers
{
	public static double length(point a, point b)
	{
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) * (a.z - b.z));
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(11);
		points[] ps = tangible.Arrays.initializeWithDefaultpointsInstances(101);
		points pst = new points();
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
				p[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].z = Double.parseDouble(tempVar4);
			}
		}

		k = 0;
		for (i = 0;i < n;i++) //p1
		{
			for (j = i + 1;j < n;j++) //p2
			{
				if (i == j)
				{
					continue;
				}
				ps[k].x1 = p[i].x;
				ps[k].y1 = p[i].y;
				ps[k].z1 = p[i].z;
				ps[k].x2 = p[j].x;
				ps[k].y2 = p[j].y;
				ps[k].z2 = p[j].z;
				ps[k].len = length(p[i], p[j]);
				k++;
			}
		}

		m = n * (n - 1) / 2;
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (ps[j].len < ps[j + 1].len)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: pst=ps[j];
					pst.copyFrom(ps[j]);
					ps[j] = ps[j + 1];
					ps[j + 1] = pst;
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			System.out.printf("(%g,%g,%g)-(%g,%g,%g)=%.2lf\n",ps[i].x1,ps[i].y1,ps[i].z1,ps[i].x2,ps[i].y2,ps[i].z2,ps[i].len);
		}

	}
}

