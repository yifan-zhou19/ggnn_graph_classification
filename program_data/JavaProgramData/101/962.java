package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		for (int a = 1;a <= 3;a++)
		{
			for (int b = 1;b <= 3;b++)
			{
				for (int c = 1;c <= 3;c++)
				{
					A = (a < b) + (a == c);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if (a < b && b < c && A > B && B > C)
					{
						System.out.print("ABC\n");
					}
					if (a < c && c < b && A > C && C > B)
					{
						System.out.print("ACB\n");
					}
					if (b < a && a < c && B > A && A > C)
					{
						System.out.print("BAC\n");
					}
					if (b < c && c < a && B > C && C > A)
					{
						System.out.print("BCA\n");
					}
					if (c < a && a < b && C > A && A > B)
					{
						System.out.print("CAB\n");
					}
					if (c < b && b < a && C > B && B > A)
					{
						System.out.print("CBA\n");
					}
				}
			}
		}
		return 0;
	}
}
