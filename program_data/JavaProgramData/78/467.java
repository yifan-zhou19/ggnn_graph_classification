package <missing>;

public class GlobalMembers
{
	public static int z;
	public static int q;
	public static int s;
	public static int l;
	public static int take_ans()
	{
		if (z == 50)
		{
			System.out.print("z 50");
			System.out.print("\n");
		}
		if (q == 50)
		{
			System.out.print("q 50");
			System.out.print("\n");
		}
		if (s == 50)
		{
			System.out.print("s 50");
			System.out.print("\n");
		}
		if (l == 50)
		{
			System.out.print("l 50");
			System.out.print("\n");
		}
		if (z == 40)
		{
			System.out.print("z 40");
			System.out.print("\n");
		}
		if (q == 40)
		{
			System.out.print("q 40");
			System.out.print("\n");
		}
		if (s == 40)
		{
			System.out.print("s 40");
			System.out.print("\n");
		}
		if (l == 40)
		{
			System.out.print("l 40");
			System.out.print("\n");
		}
		if (z == 30)
		{
			System.out.print("z 30");
			System.out.print("\n");
		}
		if (q == 30)
		{
			System.out.print("q 30");
			System.out.print("\n");
		}
		if (s == 30)
		{
			System.out.print("s 30");
			System.out.print("\n");
		}
		if (l == 30)
		{
			System.out.print("l 30");
			System.out.print("\n");
		}
		if (z == 20)
		{
			System.out.print("z 20");
			System.out.print("\n");
		}
		if (q == 20)
		{
			System.out.print("q 20");
			System.out.print("\n");
		}
		if (s == 20)
		{
			System.out.print("s 20");
			System.out.print("\n");
		}
		if (l == 20)
		{
			System.out.print("l 20");
			System.out.print("\n");
		}
		if (z == 10)
		{
			System.out.print("z 10");
			System.out.print("\n");
		}
		if (q == 10)
		{
			System.out.print("q 10");
			System.out.print("\n");
		}
		if (s == 10)
		{
			System.out.print("s 10");
			System.out.print("\n");
		}
		if (l == 10)
		{
			System.out.print("l 10");
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 10;s <= 50;s = s + 10)
				{
					if (z == s || q == s)
					{
						continue;
					}
					for (l = 10;l <= 50;l = l + 10)
					{
						if (z == l || q == l || s == l)
						{
							continue;
						}
						if (z + q != s + l)
						{
							continue;
						}
						if (z + l <= s + q)
						{
							continue;
						}
						if (z + s >= q)
						{
							continue;
						}
						take_ans();
						return 0;
					}
				}
			}
		}
	}

}
