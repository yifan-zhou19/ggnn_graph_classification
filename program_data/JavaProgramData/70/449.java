public class dian
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static dian[] a = tangible.Arrays.initializeWithDefaultdianInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int k = 0;
		int j;
		int t;
		double[] c = new double[100];
		double max;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct dian *p=a;
		dian[] p = new dian(a);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = p;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.y = Double.parseDouble(tempVar3);
			}
			p++;
		}
		p = t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				c[k] = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y));
				k++;
			}
		}
		max = c[0];
		for (i = 0;i <= k;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.printf("%.4lf",max);
	}
}

