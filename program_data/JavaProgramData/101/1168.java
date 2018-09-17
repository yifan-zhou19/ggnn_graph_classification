package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					A = (b > a) + (a == c);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if (((A > B && a < b) || (A < B && a> b) || (A == B && a == b)) + ((A> C && a < c) || (A < C && a> c) || (A == C && a == c)) + ((B> C && b < c) || (B < C && b> c) || (B == C && b == c)) == 3)
					{
						if (a >= b != 0 && b >= c)
						{
							System.out.print("CBA");
						}
						if (b > a && b >= c)
						{
							System.out.print("CAB");
						}
						if (c > a && a >= b)
						{
							System.out.print("BAC");
						}
						if (a >= b != 0 && c > b)
						{
							System.out.print("BCA");
						}
						if (b > a && c > a)
						{
							System.out.print("ACB");
						}
						if (c > b && b > a)
						{
							System.out.print("ABC");
						}
						break;
					}
				}
			}
		}
		return 0;
	}
}
