package <missing>;

public class GlobalMembers
{
	/*
	*???.cpp
	*??
	*2011?11?16?
	*?????xi?
	*/
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int min(int c,int d)
	{
		if (c < d)
		{
			return c;
		}
		else
		{
			return d;
		}
	}
	public static int Main()
	{
		int inter;
		int x;
		int y;
		int t1;
		int t2;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t1 = x;
		t2 = y;
		if (t1 == t2)
		{
			System.out.print(t1);
			System.out.print("\n");
		}
		else
		{
				while (true)
				{
					inter = t1;
					t1 = max(t1, t2);
					t2 = min(inter, t2);
					t1 = t1 / 2;
					if (t1 == t2)
					{
							System.out.print(t1);
							System.out.print("\n");
							break;
					}
				}
		}
		return 0;
	}
}

