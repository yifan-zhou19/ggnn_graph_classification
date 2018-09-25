package <missing>;

public class GlobalMembers
{
	//Name:    ???      #
	//Author:   ??       #
	//Number: 1000062710   #
	//Date:  2010?11?23?#
	///######################
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A = 0;
		int B = 0;
		int C = 0;
		while (true)
		{
			A = 1;
			B = 2;
			C = 3;
			a = (B > A) + (C == A);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);
			if ((a == 2) && (b == 1) && (c == 0))
			{
				System.out.print("ABC");
				System.out.print("\n");
			}
			break;
		}
		while (true)
		{
			A = 1;
			B = 3;
			C = 2;
			a = (B > A) + (C == A);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);
			if ((a == 2) && (c == 1) && (b == 0))
			{
				System.out.print("ACB");
				System.out.print("\n");
			}
			break;
		}
		while (true)
		{
			B = 1;
			A = 2;
			C = 3;
			a = (B > A) + (C == A);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);
			if ((b == 2) && (a == 1) && (c == 0))
			{
				System.out.print("BAC");
				System.out.print("\n");
			}
			break;
		}
		while (true)
		{
			B = 1;
			C = 2;
			A = 3;
			a = (B > A) + (C == A);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);

			if ((b == 2) && (c == 1) && (a == 0))
			{
				System.out.print("BCA");
				System.out.print("\n");
			}
			break;
		}
		while (true)
		{
			C = 1;
			B = 2;
			A = 3;
			a = (B > A) + (C == A);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);
			if ((c == 2) && (b == 1) && (a == 0))
			{
				System.out.print("CBA");
				System.out.print("\n");
			}
			break;
		}
		while (true)
		{
			C = 1;
			A = 2;
			B = 3;
			a = (B > A) + (C == A);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);
			if ((c == 2) && (a == 1) && (b == 0))
			{
				System.out.print("CAB");
				System.out.print("\n");
			}
			break;
		}
			return 0;
	}
}
