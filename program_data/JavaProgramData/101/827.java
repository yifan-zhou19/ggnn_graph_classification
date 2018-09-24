package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		A = 2, B = 1, C = 0;
		if (B < A && A != C)
		{
		if ((A > B && A < C) || (A < B && A > C))
		{
		if (C > B && B > A)
		{
		System.out.print("CBA");
		}
		}
		}

		A = 2, B = 0, C = 1;
		if (B < A && A != C)
		{
		if (A > B && A > C)
		{
		if ((C > B && B < A) || (C < B && B > A))
		{
		System.out.print("BCA");
		}
		}
		}

		A = 1, B = 0, C = 2;
		if ((B < A && A == C) || (B > A && A != C))
		{
		if (A > B && A > C)
		{
		if (C < B && B < A)
		{
		System.out.print("BAC");
		}
		}
		}

		A = 1, B = 2, C = 0;
		if ((B < A && A == C) || (B > A && A != C))
		{
		if (A < B && A < C)
		{
		if (C > B && B > A)
		{
		System.out.print("CAB");
		}
		}
		}

		A = 0, B = 2, C = 1;
		if (B > A && A == C)
		{
		if (A < B && A < C)
		{
		if ((C > B && B < A) || (C < B && B > A))
		{
		System.out.print("ACB");
		}
		}
		}

		A = 0, B = 1, C = 2;
		if (B > A && A == C)
		{
		if ((A > B && A < C) || (A < B && A > C))
		{
		if (C < B && B < A)
		{
		System.out.print("ABC");
		}
		}
		}

		return 0;
	}
	// ( > w < ) finished~ 
}
