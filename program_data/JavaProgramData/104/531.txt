package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[40];
		int[] b = new int[40];
		int x1;
		int y1;
		int i;
		int j;
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
		if (x == y)
		{
			System.out.printf("%d\n", x);
			return 0;
		}
		if (x == 1 || y == 1)
		{
			System.out.print("1\n");
			return 0;
		}
		x1 = Math.sqrt(x);
		y1 = Math.sqrt(y);
		a[0] = x;
		b[0] = y;
		for (i = 1;i <= x1;i++)
		{
			a[i] = a[i - 1] / 2;
		}
		for (i = 1;i <= y1;i++)
		{
			b[i] = b[i - 1] / 2;
		}
		for (i = 0;i <= x1;i++)
		{
			for (j = 0;j <= y1;j++)
			{
				if (b[j] == a[i])
				{
					System.out.printf("%d\n", a[i]);
					return 0;
				}
			}
		}
	}







}

