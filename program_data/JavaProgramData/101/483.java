package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				c = 6 - a - b;
				x = (b > a) + (c == a); ///////////////////?????????????????
				y = (a > b) + (a > c);
				z = (c > b) + (b > a);
				if (a + x == b + y && b + y == c + z)
				{
					if (a > b && b > c)
					{
						System.out.print("CBA");
						System.out.print("\n");
					}
					if (a > c && c > b)
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					if (b > a && a > c)
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					if (b > c && c > a)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					if (c > a && a > b)
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					if (c > b && b > a)
					{
						System.out.print("ABC");
						System.out.print("\n");
					}
				}
			}
		}
				return 0;
	}
}
