package <missing>;

public class GlobalMembers
{
	//*****************************
	//*???
	//******************************
	public static int Main()
	{
		int A;
		int B;
		int C;
		int sumA;
		int sumB;
		int sumC;
		sumA = (B > A) + (C == A);
		sumB = (A > B) + (A > C);
		sumC = (C > B) + (B > A);
		if (A > B && B > C && sumA < sumB && sumB < sumC)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		if (A > C && C > B && sumA < sumC && sumC < sumB)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (B > A && A > C && sumB < sumA && sumA < sumC)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (B > C && C > A && sumB < sumC && sumC < sumA)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		if (C > A && A > B && sumC < sumA && sumA < sumB)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (C > B && B > A && sumC < sumB && sumB < sumA)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		return 0;
	}
}
