package <missing>;

public class GlobalMembers
{
	 //???:?????? 
	 //??:???
	 //??:2010?11?17?
	 //??:?????? 
	public static int Main()

	{
		int[][] a =
		{
			{0, 1, 2},
			{0, 2, 1},
			{1, 2, 0},
			{1, 0, 2},
			{2, 0, 1},
			{2, 1, 0}
		}; // ?????????
		int i;
		int A;
		int B;
		int C;
		for (i = 0 ; i <= 5 ; i++)
		{
			A = (a[i][1] > a[i][0]) + (a[i][2] == a[i][0]);
			B = (a[i][0] > a[i][1]) + (a[i][0] > a[i][2]);
			C = (a[i][2] > a[i][1]) + (a[i][1] > a[i][0]);
			if (A + a[i][0] == 2 && B + a[i][1] == 2 && C + a[i][2] == 2) // ????????????????????
			{
				break;
			}
		}
		if (A > B && B > C) // ?????????
		{
			System.out.print("ABC");
		}
		if (A > C && C > B)
		{
			System.out.print("ACB");
		}
		if (B > A && A > C)
		{
			System.out.print("BAC");
		}
		if (B > C && C > A)
		{
			System.out.print("BCA");
		}
		if (C > A && A > B)
		{
			System.out.print("CAB");
		}
		if (C > B && B > A)
		{
			System.out.print("CBA");
		}
		return 0;
	}
}
