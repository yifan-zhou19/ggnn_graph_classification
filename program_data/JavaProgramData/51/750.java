package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int m;
		int n;
		String x = new String(new char[510]);
		int[] y = new int[510];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		a = x.length() - 1;
		for (b = 0;b <= a - n + 1;b++)
		{
			for (c = b;c <= a - n + 1;c++)
			{
				for (d = 0;d <= n - 1;d++)
				{
					if (x.charAt(c + d) != x.charAt(b + d))
					{
					break;
					}
					else
					{
						;
					}
				}
				if (d == n)
				{
				y[b]++;
				}
				else
				{
					;
				}
			}
		};
		m = y[0];
		for (b = 0;b <= a - n + 1;b++)
		{
			if (y[b] > m)
			{
			m = y[b];
			}
			else
			{
				;
			}
		}
		if (m == 1)
		{
		System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",m);
			for (b = 0;b <= a - n + 1;b++)
			{
				if (y[b] == m)
				{
					for (c = 0;c <= n - 1;c++)
					{
					System.out.printf("%c",x.charAt(b + c));
					}
					System.out.print("\n");
				}
			}
		}
	}
}

