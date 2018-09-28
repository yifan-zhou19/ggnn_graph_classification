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
		for (a = 5;a <= 5;a++)
		{
			for (b = 2;b <= 2;b++)
			{
				for (c = 1;c <= 1;c++)
				{
					for (d = 3;d <= 3;d++)
					{
						for (e = 4;e <= 4;e++)
						{
							if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e && e != 2 && e != 3 && ((e == 1 && (a == 1 || a == 2)) + (b == 2 && (b == 1 || b == 2)) + (a == 5 && (c == 1 || c == 2)) + (c != 1 && (d == 1 || d == 2)) + (d == 1 && (e == 1 || e == 2)) == 2))
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
