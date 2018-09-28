/**
* @file C12Q4.cpp
* @author ???
* @date 2013-12-14
* @description
* ??????:????
*/





public class node
{
	public int x;
	public int y;
	public int z;
}

public class distance
{
	public node pn1;
	public node pn2;
	public double v;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		node[] ns = tangible.Arrays.initializeWithDefaultnodeInstances(MAX);
		distance[] ds = tangible.Arrays.initializeWithDefaultdistanceInstances(MAX * MAX);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++)
		{
			ns[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ns[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ns[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int p = 0;
		for (int i = 0 ; i < n ; i++)
		{
			for (int j = i + 1 ; j < n ; j++)
			{
				ds[p].pn1 = ns + i;
				ds[p].pn2 = ns + j;
				ds[p].v = Math.sqrt((ns[i].x - ns[j].x) * (ns[i].x - ns[j].x) + (ns[i].y - ns[j].y) * (ns[i].y - ns[j].y) + (ns[i].z - ns[j].z) * (ns[i].z - ns[j].z));
				p++;
			}
		}
		for (int i = 0 ; i < p ; i++)
		{
			for (int j = p - 1; j > i ; j--)
			{
				if (ds[j].v > ds[j - 1].v)
				{
					distance tmp = ds[j];
					ds[j] = ds[j - 1];
					ds[j - 1] = tmp;
				}
			}
		}

		for (int i = 0 ; i < p ; i++)
		{
			System.out.print('(');
			System.out.print(ds[i].pn1.x);
			System.out.print(',');
			System.out.print(ds[i].pn1.y);
			System.out.print(',');
			System.out.print(ds[i].pn1.z);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print(ds[i].pn2.x);
			System.out.print(',');
			System.out.print(ds[i].pn2.y);
			System.out.print(',');
			System.out.print(ds[i].pn2.z);
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f", ds[i].v);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

