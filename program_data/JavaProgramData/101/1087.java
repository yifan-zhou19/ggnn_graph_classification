package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : c.cpp
	// Author      : shaodian
	// Version     :
	// Copyright   : Your copyright notice
	// Description :
	//============================================================================


	public static int Main()
	{
		int A;
		int B;
		int C;
		for (int a = 1;a <= 3;a++) //a???1????????
		{
			 for (int b = 1;b <= 3;b++)
			 {
				 for (int c = 1;c <= 3;c++) //??a,b,c??A,B,C??????
				 {
					 A = (b > a) + (c == a);
				 B = (a > b) + (a > c);
				 C = (c > b) + (b > a);
				 if (A > B && B > C && a < b && b < c)
				 {
					 System.out.print("ABC");
					 System.out.print("\n");
					 break;
				 }
				 if (A > C && A > B && a < c && C < b)
				 {
					 System.out.print("ACB");
					 System.out.print("\n");
					 break;
				 }
				 if (B > A && A > C && b < a && a < c)
				 {
					 System.out.print("BAC");
					 System.out.print("\n");
					 break;
				 }
				 if (B > C && C > A && b < c && c < a)
				 {
					 System.out.print("BCA");
					 System.out.print("\n");
					 break;
				 }
				 if (C > A && A > B && c < a && a < b)
				 {
					 System.out.print("CAB");
					 System.out.print("\n");
					 break;
				 }
				 if (C > B && B > A && c < b && b < a)
				 {
					 System.out.print("CBA");
					 System.out.print("\n");
					 break;
				 } //?????????
				 }
			 }
		}


		return 0;
	}
}
