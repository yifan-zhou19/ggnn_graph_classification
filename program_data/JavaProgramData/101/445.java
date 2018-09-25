package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int A;
		int B;
		int C;
		int d;
		int e;
		for (A = 0;A <= 2;A++)
		{
			for (B = 0;B <= 2;B++)
			{
				for (C = 0;C <= 2;C++)
				{
					if ((A != B) && (A != C) && (B != C))
					{
						if (A > B && B > C && (B > A || A == C) == 0 && C > B && B > A == 1 && ((A > B && A > C) + (A > B || A > C)) == 1)
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
							System.out.print("\n");
						}
						if (A > C && C > B && (B > A || A == C) == 0 && (A > B && A > C) == 1 && ((C > B && B > A) + (C > B || B > A)) == 1)
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
							System.out.print("\n");
						}
						if (B > A && A > C && (B > A || A == C) == 0 && (C > B && B > A) == 1 && ((B > A && A == C) + (B > A || A == C)) == 1)
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
							System.out.print("\n");
						}
						if (B > C && C > A && (B > A || A == C) == 0 && (B > A && A == C) == 1 && ((C > B && B > A) + (C > B || B > A)) == 1)
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
							System.out.print("\n");
						}
						if (C > A && A > B && (C > B || B > A) == 0 && (A > B && A > C) == 1 && ((B > A && A == C) + (B > A || A == C)) == 1)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
							System.out.print("\n");
						}
						if (C > B && B > A && (C > B || B > A) == 0 && (B > A && A == C) == 1 && ((A > B && A > C) + (A > B || A > C)) == 1)
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
							System.out.print("\n");
						}
					}

				}
			}
		}













		return 0;
	}
}
