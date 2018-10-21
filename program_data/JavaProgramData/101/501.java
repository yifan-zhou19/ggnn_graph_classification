package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int TA;
		int TB;
		int TC;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 6 - A - B;C <= 3;C++)
				{
					if (A == B)
					{
						break;
					}
					else
					{
						TA = (A < B) + (A == C) + A;
						TB = (B < A) + (C < A) + B;
						TC = (B < C) + (A < B) + C;
						if (TA == 3 && TB == 3 && TC == 3)
						{
							if (A < B && B < C)
							{
								System.out.print("ABC");
							}
							if (A < C && C < B)
							{
								System.out.print("ACB");
							}
							if (B < A && A < C)
							{
								System.out.print("BAC");
							}
							if (B < C && C < A)
							{
								System.out.print("BCA");
							}
							if (C < A && A < B)
							{
								System.out.print("CAB");
							}
							if (C < B && C < A)
							{
								System.out.print("CBA");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
