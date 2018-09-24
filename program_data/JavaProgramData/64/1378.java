/* ????????.cpp
 * ???1200012826 ??
 * ??? 2012?12?14?
 */
public class point
{
	public int x;
	public int y;
	public int z;
}
public class distance
{
	public int a;
	public int b;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static point[] p = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static distance[] d = tangible.Arrays.initializeWithDefaultdistanceInstances(45);
	public static distance tr = new distance();
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				d[k].dis = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y) + (p[i].z - p[j].z) * (p[i].z - p[j].z));
				d[k].a = i;
				d[k].b = j;
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - i - 1; j++)
			{
				if (d[j].dis < d[j + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tr=d[j];
					tr.copyFrom(d[j]);
					d[j] = d[j + 1];
					d[j + 1] = tr;
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print("(");
			System.out.print(p[d[i].a].x);
			System.out.print(",");
			System.out.print(p[d[i].a].y);
			System.out.print(",");
			System.out.print(p[d[i].a].z);
			System.out.print(")-(");
			System.out.print(p[d[i].b].x);
			System.out.print(",");
			System.out.print(p[d[i].b].y);
			System.out.print(",");
			System.out.print(p[d[i].b].z);
			System.out.print(")=");
			System.out.printf("%.2f", d[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

