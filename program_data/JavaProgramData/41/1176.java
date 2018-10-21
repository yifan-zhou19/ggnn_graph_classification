package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int a = 2;a <= 5;a++)
		{
			for (int b = 2;b <= 5;b++)
			{
				for (int c = 1;c <= 5;c++)
				{
					for (int d = 2;d <= 5;d++)
					{
						for (int e = 4;e <= 5;e++)
						{
							if ((e == 1) + (b == 2) + (a == 5) + (c != 1) + (d == 1) == 2 && a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e)
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
		return 0;
	}
}
