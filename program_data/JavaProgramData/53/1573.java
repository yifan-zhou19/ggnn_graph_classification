package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int b = 1;
		int c;
		int d;
		int f = 1;
		int g = 0;
		int i = 2;
		int j = 1;
		int k = 1;
		int x = 2;
		int y = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (b <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[b] = Integer.parseInt(tempVar2);
			}
			b++;
		}
		b = b - 2;
		d = b;

		while (k <= d + 1)
		{
			while (i <= d + 1)
			{
				if (a[k] == a[i])
				{
					x = i;
					while (x <= d)
					{
						a[x] = a[x + 1];
						x = x + 1;
					}
					d = d - 1;
					i = i;
				}
				else
				{
					i = i + 1;
				}
			}
			k++;
			y++;
			i = y;
			x = y;
		}
		while (f <= d + 1)
		{
			System.out.printf("%d",a[f]);
			g++;
			if (g != d + 1)
			{
				System.out.print(",");
			}
			f++;
		}
	return 0;
	}
}

