package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++) //????
		{
			for (b = 1;b <= 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 1;c <= 3;c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					if (a == 1)
					{
						if (b <= a != 0 || c != a)
						{
							continue;
						}
					}
					if (a == 2)
					{
						if ((b > a && c == a) || (b <= a != 0 && c != a))
						{
							continue;
						}
					}
					if (a == 3)
					{
						if (b > a || c == a)
						{
							continue;
						}
					}
					if (b == 1)
					{
						if (a <= b != 0 || a <= c)
						{
							continue;
						}
					}
					if (b == 2)
					{
						if ((a <= b != 0 && a <= c) || (a> b && a> c))
						{
							continue;
						}
					}
					if (b == 3)
					{
						if (a > b || a > c)
						{
							continue;
						}
					}
					if (c == 1)
					{
						if (c <= b != 0 || c <= a)
						{
							continue;
						}
					}
					if (c == 2)
					{
						if ((c <= b != 0 && c <= a) || c> b && c> a)
						{
							continue;
						}
					}
					if (c == 3)
					{
						if (c > b || c > a)
						{
							continue;
						}
					}
					if (a == 1 && b == 2 && c == 3) //????????
					{
						System.out.print("ABC");
						System.out.print("\n");
					}
					if (a == 1 && b == 3 && c == 2)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					if (a == 2 && b == 1 && c == 3)
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					if (a == 2 && b == 3 && c == 1)
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					if (a == 3 && b == 1 && c == 2)
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					if (a == 3 && b == 2 && c == 1)
					{
						System.out.print("CBA");
						System.out.print("\n");
					}
					break;
				}
			}
		}
		return 0;
	}
}
