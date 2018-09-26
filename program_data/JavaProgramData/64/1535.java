//************************
//*??????? **
//*?????? **
//*???1200012957 **
//*???2012-12-13 **
//************************

public class point // ???????????????
{
	public int x;
	public int y;
	public int z;
}

public class distance // ???????????????????????????????
{
	public int f;
	public int b;
	public double s;
}

package <missing>;

public class GlobalMembers
{
	public static point[] p = tangible.Arrays.initializeWithDefaultpointInstances(10); // ?????
	public static distance[] a = tangible.Arrays.initializeWithDefaultdistanceInstances(45);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			// ???????
			p[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int m = n * (n - 1) / 2; // ?????????????
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				// ?????????
				a[k].s = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y) + (p[i].z - p[j].z) * (p[i].z - p[j].z));
				a[k].f = i; // ?????????????
				a[k].b = j;
				k++;
			}
		}
		for (i = 0; i < m; i++)
		{
			k = i;
			for (j = i + 1; j < m; j++)
			{
				// ??????????
				if (a[k].s < a[j].s)
				{
					k = j;
				}
				else
				{
					// ?????????????????
					if (a[k].s == a[j].s)
					{
						// ??????????????????????
						if ((a[k].f > a[j].f) || ((a[k].f == a[j].f) && (a[k].b > a[j].b)))
						{
							k = j;
						}
					}
				}
			}
			// ??????
			System.out.print("(");
			System.out.print(p[a[k].f].x);
			System.out.print(",");
			System.out.print(p[a[k].f].y);
			System.out.print(",");
			System.out.print(p[a[k].f].z);
			System.out.print(")-");
			System.out.print("(");
			System.out.print(p[a[k].b].x);
			System.out.print(",");
			System.out.print(p[a[k].b].y);
			System.out.print(",");
			System.out.print(p[a[k].b].z);
			System.out.print(")=");
			System.out.printf("%.2f", a[k].s);
			System.out.printf("%.2f", "\n");
			a[k] = a[i];
		}

		return 0;
	}
}

