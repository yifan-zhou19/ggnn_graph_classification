package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		x = a[0];
		y = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < x)
			{
				x = a[i];
			}
			if (b[i] > y)
			{
				y = b[i];
			}
		}
		int z;
		z = x;
		for (int k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] <= z != 0 && b[i]> z)
				{
					z = b[i];
				}
			}
		}
		if (z == y)
		{
			System.out.printf("%d %d",x,y);
		}
		if (z != y)
		{
			System.out.print("no");
		}
		return 0;
	}
}

