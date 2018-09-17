package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		m = n = 0;
		while (x != 0)
		{
			a[m] = x;
			x /= 2;
			m++;
		}
		while (y != 0)
		{
			b[n] = y;
			y /= 2;
			n++;
		}
		for (i = 1;i <= 10;i++)
		{
			if (a[m - i] != b[n - i])
			{
				break;
			}
		}
		System.out.printf("%d",a[m - i + 1]);
		return 0;
	}
}

