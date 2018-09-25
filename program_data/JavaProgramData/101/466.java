package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int Ca;
		int Cb;
		int Cc;
		int RA;
		int RB;
		int RC;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				if (b == a)
				{
					continue;
				}
				else
				{
					c = 3 - a - b;
					Ca = (b > a);
					Cb = (a > b) + (a > c);
					Cc = (c > b) + (b > a);
					if ((Ca + a == 2) && (Cb + b == 2) && (Cc + c == 2))
					{
						RA = a;
						RB = b;
						RC = c;
					}

				}
			}
		}
		if (RA > RB && RB > RC)
		{
			System.out.print("CBA");
		}
		if (RA > RC && RA > RB)
		{
			System.out.print("BCA");
		}
		if (RB > RA && RA > RC)
		{
			System.out.print("CAB");
		}
		if (RB > RC && RC > RA)
		{
			System.out.print("ACB");
		}
		if (RC > RA && RA > RB)
		{
			System.out.print("BAC");
		}
		if (RC > RB && RB > RA)
		{
			System.out.print("ABC");
		}
		return 0;
	}
}
