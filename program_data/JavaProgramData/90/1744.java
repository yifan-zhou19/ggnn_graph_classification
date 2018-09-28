package <missing>;

public class GlobalMembers
{
	//********************
	// 1.cpp
	// ??  1200018415
	// 2012 11 26
	//********************

	public static int putapples(int c, int d)
	{
		if (c == 1 || c == 0 || d == 1)
		{
			return 1;
		}
		if (c < 0)
		{
			return 0;
		}
		else
		{
			return putapples(c - d, d) + putapples(c, d - 1);
		}
	}

	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				if (a == 1)
				{
					System.out.print(b);
					System.out.print("\n");
				}
				else
				{
					System.out.print(putapples(a, b));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

