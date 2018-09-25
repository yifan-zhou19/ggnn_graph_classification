package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int[][] d =
		{
			{1, 2, 3},
			{1, 3, 2},
			{2, 1, 3},
			{2, 3, 1},
			{3, 1, 2},
			{3, 2, 1}
		};
		for (int i = 4;i < 6;i++)
		{
			A = d[i][0];
			B = d[i][1];
			C = d[i][2];
			if ((B > A) + (A == C) + (A > B) + (A > C) + (C > B) + (B > A) == 3)
			{
				if (A > B && B > C)
				{
					System.out.print("CBA");
					System.out.print("\n");
				}
				else if (A > C && C > B)
				{
					System.out.print("BCA");
					System.out.print("\n");
				}
				else if (B > A && A > C)
				{
					System.out.print("CAB");
					System.out.print("\n");
				}
				else if (B > C && C > A)
				{
					System.out.print("ACB");
					System.out.print("\n");
				}
				else if (C > A && A > B)
				{
					System.out.print("BAC");
					System.out.print("\n");
				}
				else if (C > B && B > A)
				{
					System.out.print("ABC");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
