package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int a1;
		int b1;
		int c1;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					a1 = (b < a) + (c == a);
					b1 = (a < b) + (a < c);
					c1 = (c < b) + (b < a);
					//cout << a1 << " " << b1 << " " << c1 << "  " <<endl;
					if (a1 < b1 && a1 < c1 && b1 < c1 && a < b && a < c && b < c)
					{
						System.out.print("CBA");
						System.out.print("\n");
					}
					else if (a1 < b1 && a1 < c1 && c1 < b1 && a < b && a < c && c < b)
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					else if (b1 < a1 && b1 < c1 && a1 < c1 && b < a && b < c && a < c)
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					else if (b1 < a1 && b1 < c1 && c1 < a1 && b < a && b < c && c < a)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					else if (c1 < a1 && c1 < b1 && a1 < b1 && c < a && c < b && a < b)
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					else if (c1 < a1 && c1 < b1 && b1 < a1 && c < a && c < b && b < a)
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
