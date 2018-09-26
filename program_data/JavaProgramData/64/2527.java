public class point
{
	public int x;
	public int y;
	public int z;
}

public class len
{
	public double real;
	public point a;
	public point b;
}

package <missing>;

public class GlobalMembers
{
	public static point[] points = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static len[] len = tangible.Arrays.initializeWithDefaultlenInstances(1000);
	public static int lencount = 0;

	public static int cmp(Object a, Object b)
	{
		double k;
		len aa = (len)a;
		len bb = (len)b;
		if ((k = aa.real - bb.real))
		{
			return k < 0;
		}
		return aa.a - bb.a;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		double tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(points[i].x) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(points[i].y) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(points[i].z) = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				tmp = 0;
				tmp += Math.pow(points[i].x - points[j].x, 2);
				tmp += Math.pow(points[i].y - points[j].y, 2);
				tmp += Math.pow(points[i].z - points[j].z, 2);
				len[lencount].real = Math.pow(tmp, 0.5);
				len[lencount].a = points[i];
				len[lencount].b = points[j];
				lencount++;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(len, lencount, sizeof(len), cmp);
		for (i = 0; i < lencount; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", (len[i].a).x, (len[i].a).y, (len[i].a).z, (len[i].b).x, (len[i].b).y, (len[i].b).z, len[i].real);
		}

		return 0;
	}

}

