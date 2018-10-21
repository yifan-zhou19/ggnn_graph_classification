public class point
{
	public double x;
	public double y;
	public double z;
}
public class dianju
{
	public double d;
	public point p1 = new point();
	public point p2 = new point();
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		double julijisuan = new double(struct point p1,struct point p2);
		int n;
		int i;
		int j;
		int k;
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(m);
		dianju[] D = tangible.Arrays.initializeWithDefaultdianjuInstances(m * (m - 1) / 2);
		dianju a = new dianju();
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
		for (i = 0,k = 0;i < n - 1;i++)
		{

			for (j = i;j < n - 1;j++,k++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: D[k].p1=p[i];
				D[k].p1.copyFrom(p[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: D[k].p2=p[j+1];
				D[k].p2.copyFrom(p[j + 1]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: D[k].d=julijisuan(D[k].p1,D[k].p2);
				D[k].d = julijisuan(new point(D[k].p1), new point(D[k].p2));
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - 1;j++)
			{
				if (D[j].d < D[j + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: a=D[j];
					a.copyFrom(D[j]);
					D[j] = D[j + 1];
					D[j + 1] = a;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",D[i].p1.x,D[i].p1.y,D[i].p1.z,D[i].p2.x,D[i].p2.y,D[i].p2.z,D[i].d);
		}





	}


	public static double julijisuan(point p1, point p2)
	{
		return (Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y) + (p1.z - p2.z) * (p1.z - p2.z)));
	}
}

