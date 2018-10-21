package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					if ((B <= A) + (C != A) == A - 1 && (A <= B) + (A <= C) == B - 1 && (C <= B) + (B <= A) == C - 1)
					{
					if (A > B && B > C)
					{
						System.out.print("CBA");
						System.out.print("\n");
					}
					if (A > C && C > B)
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					if (B > A && A > C)
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					if (B > C && C > A)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					if (C > A && A > B)
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					if (C > B && B > A)
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
