public class student
{
	public int num;
	public int yw;
	public int sx;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x = 0;
		int y = 0;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i].num = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i].yw = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i].sx = Integer.parseInt(tempVar4);
				}
				b[i] = a[i].yw + a[i].sx;
		}
		for (i = 1;i < n;i++)
		{
				if (b[x] < b[i])
				{
					x = i;
				}
		}
		System.out.printf("%d %d\n",a[x].num,b[x]);
		for (i = 1;i < n;i++)
		{
				if (i == x)
				{
					continue;
				}
				if (b[y] < b[i])
				{
					y = i;
				}
		}
		System.out.printf("%d %d\n",a[y].num,b[y]);
		for (i = 1;i < n;i++)
		{
				if (i == x)
				{
					continue;
				}
				if (i == y)
				{
					continue;
				}
				if (b[z] < b[i])
				{
					z = i;
				}
		}
		System.out.printf("%d %d\n",a[z].num,b[z]);
		System.in.read();
		System.in.read();
	}
}

