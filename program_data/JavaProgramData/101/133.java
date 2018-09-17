package <missing>;

public class GlobalMembers
{
	//**??????*****************//
	//**?????*******************//
	///##???11/17##################//
	public static int Main()
	{
		int a1; //A?B?C???A?B?C???
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int A;
		int B;
		int C;
		int i;
		int j;
		int k;

		for (i = 0; i <= 2; i++)
		{
			A = i;
			for (j = 0; j <= 2; j++)
			{
				B = j;
				for (k = 0; k <= 2; k++) //??
				{
					 C = k;
					a1 = B > A;
					a2 = C == A;
					b1 = A > B;
					b2 = A > C;
					c1 = C > B;
					c2 = B > A;
					if (A + a1 + a2 == B + b1 + b2 && B + b1 + b2 == C + c1 + c2) //??????????
					{
						if (A > B && B > C)
						{
							System.out.print("CBA");
						}
						if (A > C && C > B)
						{
							System.out.print("BCA");
						}
						if (B > A && A > C)
						{
							System.out.print("CAB");
						}
						if (B > C && C > A)
						{
							System.out.print("ACB");
						}
						if (C > A && A > B)
						{
							System.out.print("BAC");
						}
						if (C > B && B > A)
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
