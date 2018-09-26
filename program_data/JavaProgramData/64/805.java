public class point
{
	public int x;
	public int y;
	public int z;
}

public class line
{
	public int p1;
	public int p2;
	public double len;
}

package <missing>;

public class GlobalMembers
{
	public static point[] p = tangible.Arrays.initializeWithDefaultpointInstances(100);
	public static line[] l = tangible.Arrays.initializeWithDefaultlineInstances(1000);
	public static line t = new line();

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] d = new int[1000];
		int c = 0;
		double temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				l[c].len = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y) + (p[i].z - p[j].z) * (p[i].z - p[j].z));
				l[c].p1 = i;
				l[c].p2 = j;
				c++;
			}
		}
		for (i = 0; i < n * (n - 1) / 2; i++)
		{
			for (j = 0; j < n * (n - 1) / 2 - i; j++)
			{
				if (l[j].len < l[j + 1].len)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t = l[j];
					t.copyFrom(l[j]);
					l[j] = l[j + 1];
					l[j + 1] = t;
				}
			}
		}
		for (i = 0; i < n * (n - 1) / 2; i++)
		{
			System.out.print("(");
			System.out.print(p[l[i].p1].x);
			System.out.print(",");
			System.out.print(p[l[i].p1].y);
			System.out.print(",");
			System.out.print(p[l[i].p1].z);
			System.out.print(")-(");
			System.out.print(p[l[i].p2].x);
			System.out.print(",");
			System.out.print(p[l[i].p2].y);
			System.out.print(",");
			System.out.print(p[l[i].p2].z);
			System.out.print(")=");
			System.out.printf("%.2f", l[i].len);
			System.out.printf("%f", "\n");
		}
		return 0;
	}

}

