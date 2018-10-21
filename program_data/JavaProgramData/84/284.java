package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[10000];
		int x;
		int y;
		int z;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		x = a[1];
		y = a[2];
		if (x < y)
		{
			x = a[2];
			y = a[1];
		}
		for (i = 3;i <= n;i++)
		{
			z = a[i];
			if (z > y)
			{
				y = z;
				if (y > x)
				{
					t = x;
					x = y;
					y = t;
				}
			}
		}
		System.out.printf("%d\n%d",x,y);

	}
}

