package <missing>;

public class GlobalMembers
{
	public static int fa(int t)
	{
		if (t == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int fb(int t)
	{
		if (t == 2)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int fc(int t)
	{
		if (t == 5)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int fd(int t)
	{
		if (t == 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int fe(int t)
	{
		if (t == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main()
	{
		int a; //factory
		int b;
		int c;
		int d;
		int e;
		for (e = 1;e < 6;e++)
		{
			if (e == 2 || e == 3)
			{
				continue;
			}
			for (a = 1;a < 6;a++)
			{
				if (a == e)
				{
					continue;
				}
				for (b = 1;b < 6;b++)
				{
					if (b == a || b == e)
					{
						continue;
					}
					for (c = 1;c < 6;c++)
					{
						if (c == b || c == a || c == e)
						{
							continue;
						}
						d = 15 - a - b - c - e;
						if (a == 1 || a == 2)
						{
							if (fa(e) != 0)
							{
								continue;
							}
						}
						else
						{
							if (0 == fa(e))
							{
								continue;
							}
						}
						if (b == 1 || b == 2)
						{
							if (fb(b) != 0)
							{
								continue;
							}
						}
						else
						{
							if (0 == fb(b))
							{
								continue;
							}
						}
						if (c == 1 || c == 2)
						{
							if (fc(a) != 0)
							{
								continue;
							}
						}
						else
						{
							if (0 == fc(a))
							{
								continue;
							}
						}
						if (d == 1 || d == 2)
						{
							if (fd(c) != 0)
							{
								continue;
							}
						}
						else
						{
							if (0 == fd(c))
							{
								continue;
							}
						}
						if (e == 1)
						{
							if (fe(d) != 0)
							{
								continue;
							}
						}
						else
						{
							if (0 == fe(d))
							{
								continue;
							}
						}
						System.out.printf("%d %d %d %d %d",a,b,c,d,e);
						return;
					}
				}
			}
		}
	}
}
