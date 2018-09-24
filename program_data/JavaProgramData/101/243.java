package <missing>;

public class GlobalMembers
{
	//***************************************************
	//*   ????1000012846_4.cpp  *********************
	//*   ?????  ***********************************
	//*   ?????2010?11?  *************************
	//*   ????????  *****************************                          
	//***************************************************
	public static void judge(int A,int B,int C) //??????ABC????????
	{
		if (A < B && B < C)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		if (A < C && C < B)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		if (B < A && A < C)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (B < C && C < A)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (C < A && A < B)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (C < B && B < A)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
	}
	public static int Main() //???
	{
		int A;
		int B;
		int C;
		for (A = 0 ; A < 3 ; A++) //?????????A,B,C
		{
			for (B = 0 ; B < 3 ; B++)
			{
				for (C = 0 ; C < 3 ; C++)
				{
					if (A + (B > A) + (C == A) == 2 && B + (A > B) + (A > C) == 2 && C + (C > B) + (B > A) == 2)
					{
						judge(A, B, C); //??????
					}
				}
			}
		}
		return 0;
	}
}
