public class ren
{
	public int x;
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static ren[] a = tangible.Arrays.initializeWithDefaultrenInstances(1010);
	public static int Main()
	{
		char c;
		int i = 1;
		int j;
		int n;
		int min = 2000;
		int max = 0;
		int t;
		int d;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i].x = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		}while (c == ',');
		n = i - 1;
		i = 1;
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			i++;
		}while (c == ',');
		System.out.printf("%d ",n);
		for (i = 1;i <= n;i++)
		{
			if (a[i].x < min)
			{
				min = a[i].x;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i].y > max)
			{
				max = a[i].y;
			}
		}
		for (i = min,t = 0;i <= max - 1;i++)
		{
			for (j = 1,d = 0;j <= n;j++)
			{
				if (a[j].x <= i != 0 && a[j].y >= i + 1)
				{
					d++;
				}
			}
			if (d > t)
			{
				t = d;
			}
		}
		System.out.printf("%d",t);
		return 0;
	}
}

