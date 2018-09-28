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
		b = 2;
			for (a = 2;a <= 5;a++)
			{
				if (a != b)
				{
				for (c = 1;c <= 5;c++)
				{
			if (c != a && c != b)
			{
			for (d = 1;d <= 5;d++)
			{
				if (d != a && d != b && d != c)
				{
				for (e = 1;e <= 5;e++)
				{
						if (e != a && e != c && e != d && e != b && e != 2 && e != 3)
						{
						if (((e == 1) + (a == 5) + (c != 1) + (d == 1)) == 1)
						{
							if ((e == 1) && (a != 5) && (c == 1) && (d != 1))
							{
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
							System.out.print("\n");
							}
						else if ((e != 1) && (a == 5) && (c == 1) && (d != 1))
						{
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
							System.out.print("\n");
						}

						else if ((e != 1) && (a != 5) && (c != 1) && (d != 1))
						{
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
							System.out.print("\n");
						}
						else if ((e != 1) && (a != 5) && (c == 1) && (d == 1))
						{
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
							System.out.print("\n");
						}
						}
						}
				}
				}
			}
			}
				}
				}
			}
	return 0;
	}
}
