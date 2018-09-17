package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //????
		int B;
		int C;
		A = B = C = 0;
		A = 30;
		B = 20;
		C = 10;
			if (B < A && C != A && A> C && C > B) //????????????????
			{
				System.out.print("CBA");
			}
		A = 30;
		C = 20;
		B = 10;
		if (B < A && C != A && A> B && A > C && C > B || B > A)
		{
				System.out.print("BCA");
		}
		B = 30;
		A = 20;
		C = 10;
			if (A < B && A < C)
			{
				System.out.print("CAB");
			}
	   B = 30;
	   C = 20;
	   A = 10;
			if (A < B && A < C && B> A && C == A)
			{
				System.out.print("ACB");
			}
		C = 30;
		B = 20;
		A = 10;
			if (C < B && B < A)
			{
				System.out.print("ABC");
			}
		C = 30;
		A = 20;
		B = 10;
			if (C < B && B < A)
			{
				System.out.print("BAC");
			}
		return 0;
	}

}
