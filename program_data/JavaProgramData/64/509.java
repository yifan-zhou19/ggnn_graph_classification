public class distance
{
	public int point1;
	public int point2;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static distance[] a = tangible.Arrays.initializeWithDefaultdistanceInstances(200);
	public static distance t = new distance();
	public static int Main()
	{
		int[] x = new int[20];
		int[] y = new int[20];
		int[] z = new int[20];
		int n;
		int i;
		int j;
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n; i++)
		{
			for (j = i + 1; j <= n; j++, k++)
			{
				a[k].dis = Math.sqrt(Math.pow(x[i] - x[j], 2.0) + Math.pow(y[i] - y[j], 2.0) + Math.pow(z[i] - z[j], 2.0));
				a[k].point1 = i;
				a[k].point2 = j;
			}
		}
		for (k = 1; k <= n * (n - 1) / 2; k++)
		{
			for (i = 1; i <= n * (n - 1) / 2 + 1 - k; i++)
			{
				if (a[i].dis < a[i + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t = a[i];
					t.copyFrom(a[i]);
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (i = 1; i <= n * (n - 1) / 2; i++)
		{
			System.out.print("(");
			System.out.print(x[a[i].point1]);
			System.out.print(",");
			System.out.print(y[a[i].point1]);
			System.out.print(",");
			System.out.print(z[a[i].point1]);
			System.out.print(")-(");
			System.out.print(x[a[i].point2]);
			System.out.print(",");
			System.out.print(y[a[i].point2]);
			System.out.print(",");
			System.out.print(z[a[i].point2]);
			System.out.print(")=");
			System.out.printf("%.2f", a[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

