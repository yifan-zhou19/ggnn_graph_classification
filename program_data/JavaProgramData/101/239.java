package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //???????????????????????????
		int B;
		int C;
		int a;
		int b;
		int c;


		for (A = 1;A <= 3;A++)
		{
		for (B = 1;B <= 3;B++) //???123??????????????
		{
				if (B == A)
				{
					continue; //???????????????????
				}
				for (C = 1;C <= 3;C++)
				{
					if (A == C || B == C)
					{
						continue;
					}
		a = (B > A) + (C == A);
		b = (A > B) + (A > C);
		c = (C > B) + (B > A); //???????


		if (A > B && B > C && a < b && b < c)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		else if (A > C && C > B && a < c && c < b)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		else if (B > A && A > C && b < a && a < c)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		else if (B > C && C > A && b < c && c < a)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		else if (C > A && A > B && c < a && a < b)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		else if (C > B && B > A && c < b && b < a)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
				}
		}
		}


	return 0;
	}


}
