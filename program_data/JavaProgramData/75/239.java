public class ans
{
	public int x;
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		ans[] a = tangible.Arrays.initializeWithDefaultansInstances(1000);
		int[] b = new int[1000];
		int x1;
		int y1;
		int max = 0;
		int min = 1000;
		char c;
		String c2 = new String(new char[1000]);
		int i = 0;
		int j;
		int n = 0;
		int m;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x1 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (x1 < min)
			{
				min = x1;
			}
			a[i].x = x1;
			n++;
			if (c != ',')
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x1 = Integer.parseInt(tempVar3);
			}
			if (x1 > max)
			{
				max = x1;
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			a[i].y = x1;
			if (c != ',')
			{
				break;
			}
		}
		for (i = min;i <= max;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = min;j < max;j++)
			{
				if (a[i].x <= j != 0 && a[i].y> j)
				{
					b[j]++;
				}
			}
		}
		m = 0;
		for (i = min;i <= max;i++)
		{
			if (m < b[i])
			{
				m = b[i];
			}
		}
		System.out.printf("%d %d",n,m);
		return 0;
	}
}

