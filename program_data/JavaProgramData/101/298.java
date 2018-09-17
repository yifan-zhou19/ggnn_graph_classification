package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 1;
		int B = 1;
		int C = 1;
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
					if (((A < B) + (a> b) != 1) + ((A < C) + (a> c) != 1) + ((B < C) + (b> c) != 1) + ((A > B) + (a < b) != 1) + ((A> C) + (a < c) != 1) + ((B> C) + (b < c) != 1) + ((A == B) + (a == b) != 1) + ((A == C) + (a == c) != 1) + ((B == C) + (b == c) != 1) == 9)
					{
					if ((A > B) && (B > C))
					{
						System.out.print("CBA");
						System.out.print("\n");
					}
					if ((A > C) && (C > B))
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					if ((B > A) && (A > C))
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					if ((B > C) && (C > A))
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					if ((C > A) && (A > B))
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					if ((C > B) && (B > A))
					{
						System.out.print("ABC");
						System.out.print("\n");
					}
					}
				}
			}
		}
		return 0;
	}
}
