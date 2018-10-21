package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if (a > b && b > c)
					{
						System.out.print("CBA");
						System.out.print("\n");
						return 0;
					}
					if (a > c && c > b)
					{
						System.out.print("BCA");
						System.out.print("\n");
						return 0;
					}
					if (b > a && a > c)
					{
						System.out.print("CAB");
						System.out.print("\n");
						return 0;
					}
					if (b > c && c > a)
					{
						System.out.print("ACB");
						System.out.print("\n");
						return 0;
					}
					if (c > a && a > b)
					{
						System.out.print("BAC");
						System.out.print("\n");
						return 0;
					}
					if (c > b && b > a)
					{
						System.out.print("ABC");
						System.out.print("\n");
						return 0;
					}
				}
			}
		}
	}

}
