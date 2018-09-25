package <missing>;

public class GlobalMembers
{
	/*
	???????
	??????
	?????2011.10.12
	*/
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 0; A < 3; A++)
		{
			for (B = 0; B < 3; B++)
			{
				for (C = 0; C < 3; C++)
				{
					a = ((B > A) + (C == A));
					b = ((A > B) + (A > C));
					c = ((C > B) + (B > A));
					if (((A > B && a < b) || (A == B && a == b) || (A < B && a > b)) + ((A > C && a < c) || (A == C && a == c) || (A < C && a > c)) + ((B < C && b > c) || (B > C && b < c) || (B == C && b == c)) == 3) //if it matches the factor,do the sentence below
					{
						if (A >= B != 0 && B >= C)
						{
							System.out.print("CBA");
						}
						if (A >= C != 0 && C >= B)
						{
							System.out.print("BCA");
						}
						if (B >= A != 0 && A >= C)
						{
							System.out.print("CAB");
						}
						if (B >= C != 0 && C >= A)
						{
							System.out.print("ACB");
						}
						if (C >= A != 0 && A >= B)
						{
							System.out.print("BAC");
						}
						if (C >= B != 0 && B >= A)
						{
							System.out.print("ABC");
						}
					}
				}
			}
		}
	return 0;
	}
}
