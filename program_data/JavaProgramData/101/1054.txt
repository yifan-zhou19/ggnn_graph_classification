package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		for (A = 0;A <= 2;A = A + 1)
		{
			for (B = 0;B <= 2;B = B + 1)
			{
				for (C = 0;C <= 2;C = C + 1)
				{
					if ((B < A) + (C != A) == A && (A < B) + (A < C) == B && (C < B) + (B < A) == C && A != B && A != C && B != C)
					{
						break;
					}
				}
				if ((B < A) + (C != A) == A && (A < B) + (A < C) == B && (C < B) + (B < A) == C && A != B && A != C && B != C)
				{
					break;
				}
			}
			if ((B < A) + (C != A) == A && (A < B) + (A < C) == B && (C < B) + (B < A) == C && A != B && A != C && B != C)
			{
				break;
			}
		} //????????3????????????
		for (a = 0;a <= 2;a = a + 1)
		{
			if (A == a)
			{
				System.out.print("A");
			}
			if (B == a)
			{
				System.out.print("B");
			}
			if (C == a)
			{
				System.out.print("C");
			}
		} //??????
		return 0;
	}

}
