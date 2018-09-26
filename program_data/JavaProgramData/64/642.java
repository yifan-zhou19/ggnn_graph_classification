/**
* @file homework.cpp
* @author ???
* @date 2011-12-06
* @description
* ??????: ??????
*/

public class juli
{
	public int a;
	public int b;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static juli[] x = tangible.Arrays.initializeWithDefaultjuliInstances(45);
	public static juli t = new juli();

	public static int Main()
	{
		int n;
		int m = 0;
		int i;
		int j;
		int k;
		int p = 0;
		int l;
		int s;
		int r;
		int[][] a = new int[10][3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = n * n / 2 - n / 2;
		for (j = 0;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (k > j)
				{
					x[p].a = j;
					x[p].b = k;
					x[p].dis = Math.sqrt((a[j][0] - a[k][0]) * (a[j][0] - a[k][0]) + (a[j][1] - a[k][1]) * (a[j][1] - a[k][1]) + (a[j][2] - a[k][2]) * (a[j][2] - a[k][2]));
					p++;
				}
			}
		}
		for (l = 0;l < m - 1;l++)
		{
			for (s = 0;s < m - l - 1;s++)
			{
				if (x[s].dis < x[s + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=x[s];
					t.copyFrom(x[s]);
					x[s] = x[s + 1];
					x[s + 1] = t;
				}
			}
		}
		for (r = 0;r < m;r++)
		{
			System.out.print("(");
			System.out.print(a[x[r].a][0]);
			System.out.print(",");
			System.out.print(a[x[r].a][1]);
			System.out.print(",");
			System.out.print(a[x[r].a][2]);
			System.out.print(")-(");
			System.out.print(a[x[r].b][0]);
			System.out.print(",");
			System.out.print(a[x[r].b][1]);
			System.out.print(",");
			System.out.print(a[x[r].b][2]);
			System.out.print(")=");
			System.out.printf("%.2f", x[r].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}







}

