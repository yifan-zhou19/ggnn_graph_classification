//*******************************
//*???????              **
//*?????? 1300012965     **
//*???20131211              **
//*******************************
public class zb
{
		public int x;
		public int y;
		public int z;
}

package <missing>;

public class GlobalMembers
{
		public static zb[] a = tangible.Arrays.initializeWithDefaultzbInstances(11); //??????
	public static int Main()
	{
		double[] l = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int k;
		int n;
		int co = 0;
		int[] q = new int[100];
		int temp;
		int x1;
		int y1;
		int co1 = 0;
		double lo;
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int p = 1; p <= n * (n - 1) / 2; p++)
		{
			q[p] = p; //???????
		}
		for (i = 1; i <= n; i++)
		{
			a[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1; j <= n - 1; j++)
		{
			for (k = j + 1; k <= n; k++)
			{
				lo = Math.sqrt(((a[j].x - a[k].x) * (a[j].x - a[k].x) + (a[j].y - a[k].y) * (a[j].y - a[k].y) + (a[j].z - a[k].z) * (a[j].z - a[k].z)) * 1.0); //????
				co++;
				l[co] = lo;
			}
		}

		for (int x = 1; x <= n * (n - 1) / 2 - 1; x++)
		{
			for (int y = 1; y <= n * (n - 1) / 2 - x; y++)
			{
				if (l[y] < l[y + 1])
				{
					t = l[y];
					l[y] = l[y + 1];
					l[y + 1] = t; //????
					temp = q[y];
					q[y] = q[y + 1];
					q[y + 1] = temp; //????????
				}
			}
		}
		for (int x = 1; x <= n * (n - 1) / 2; x++)
		{
			co1++;
			for (int y = 1; y <= n; y++)
			{

				if (q[co1] > n - y)
				{
					q[co1] -= n - y;
				}
				else
				{
					x1 = y;
					y1 = q[co1] + y; //???????
					break;
				}
			}
			System.out.print("(");
			System.out.print(a[x1].x);
			System.out.print(",");
			System.out.print(a[x1].y);
			System.out.print(",");
			System.out.print(a[x1].z);
			System.out.print(")-(");
			System.out.print(a[y1].x);
			System.out.print(",");
			System.out.print(a[y1].y);
			System.out.print(",");
			System.out.print(a[y1].z);
			System.out.print(")=");
			System.out.printf("%.2f", l[x]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

