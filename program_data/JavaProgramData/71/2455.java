package <missing>;

public class GlobalMembers
{
	public static int max(int b, int c)
	{
		if (b > c)
		{
			return b;
		}
		return c;
	}
	public static int min(int b, int c)
	{
		if (b < c)
		{
			return b;
		}
		return c;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		while (n-- != 0)
		{
			m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (a % 4 == 0 && (a % 100) != 0 || a % 400 == 0)
			{
				if (b == 1 && c == 2 || b == 2 && c == 1)
				{
					System.out.print("NO\n");
					continue;
				}
				else if (c <= 2 && b>2 || c > 2 && b <= 2)
				{
					for (i = min(b, c);i < max(b, c);i++)
					{
						m += day[i];
					}
						m++;
					if (m % 7 == 0)
					{
						 System.out.print("YES\n");
						 continue;
					}
					else
					{
						System.out.print("NO\n");
						continue;
					}
				}
				else if (c == b)
				{
					System.out.print("NO\n");
						continue;
				}
				else
				{
					for (i = min(b, c);i < max(b, c);i++)
					{
						m += day[i];
					}
					if (m % 7 == 0)
					{
						 System.out.print("YES\n");
						 continue;
					}
					else
					{
						System.out.print("NO\n");
						continue;
					}
				}
			}
			else if (c != b)
			{
				for (i = min(b, c);i < max(b, c);i++)
				{
						m += day[i];
				}
					if (m % 7 == 0)
					{
						 System.out.print("YES\n");
						 continue;
					}
					else
					{
						System.out.print("NO\n");
						continue;
					}
			}
			else if (c == b)
			{
					System.out.print("NO\n");
						continue;
			}
		}
		return 0;
	}
}

