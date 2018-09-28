package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
		e = 1;
		for (int a = 1; a <= 5; a++)
		{
			for (b = 1; b <= 5 ;b++)
			{
				a1 = 5;
				if (b == 2 && (b != 1 || b != 2))
				{
					continue;
				}
					 b1 = 2;
				for (c = 1; c <= 5; c++)
				{
					if (a == 5 && (c != 1 || c != 2))
					{
						continue;
					}
						c1 = 1;
					for (d = 1; d <= 5; d++)
					{
						if (c != 1 && (d != 1 || d != 2))
						{
							continue;
						}
						   d1 = 3;
						   e1 = 4;
						for (e = 1 ;e <= 5;e++)
						{
							if (e == 2 || e == 3)
							{
								continue;
							}
							if (a1 != b1 && a1 != c1 && a1 != d1 && a1 != e1 && b1 != c1 && b1 != d1 && b1 != e1 && c1 != d1 && c1 != e1 && d1 != e1)
							{
								System.out.print(a1);
								System.out.print(" ");
								System.out.print(b1);
								System.out.print(" ");
								System.out.print(c1);
								System.out.print(" ");
								System.out.print(d1);
								System.out.print(" ");
								System.out.print(e1);
								System.out.print("\n");
								return 0;

							}
						}
						e = 1;
					}
					d = 1;
				}
				c = 1;
			}
			d = 1;
		}
		return 0;
	}

}
