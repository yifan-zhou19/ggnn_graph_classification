/*
 * ds.cpp
 *
 *  Created on: 2011-12-9
 *      Author: admin
 */
public class place
{
	public int x;
	public int y;
	public int z;
}
public class distance
{
	public int i1;
	public int i2;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		place[] a = tangible.Arrays.initializeWithDefaultplaceInstances(11);
		distance[] d = tangible.Arrays.initializeWithDefaultdistanceInstances(100);
		distance temp = new distance();
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = 1;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				d[k].i1 = i;
				d[k].i2 = j;
				d[k].dis = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
				k++;
			}
		}
		for (i = k - 1;i >= 1;i--)
		{
			for (j = 1;j <= i - 1;j++)
			{
				if (d[j].dis < d[j + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[j];
					temp.copyFrom(d[j]);
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		for (i = 1;i <= k - 1;i++)
		{
			System.out.print('(');
			System.out.print(a[d[i].i1].x);
			System.out.print(',');
			System.out.print(a[d[i].i1].y);
			System.out.print(',');
			System.out.print(a[d[i].i1].z);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print(a[d[i].i2].x);
			System.out.print(',');
			System.out.print(a[d[i].i2].y);
			System.out.print(',');
			System.out.print(a[d[i].i2].z);
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f", d[i].dis);
			if (i != k - 1)
			{
				System.out.printf("%.2f", "\n");
			}
		}
	return 0;
	}

}

