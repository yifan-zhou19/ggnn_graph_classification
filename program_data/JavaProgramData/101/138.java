package <missing>;

public class GlobalMembers
{
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
				if (B == A)
				{
					continue;
				}
				C = 3 - A - B;


			a = (B > A) + (C == A);
			b = (A > B) + (A > C);
			c = (C > B) + (B > A);
			if ((A + a) == 2 && (B + b) == 2 && (C + c) == 2)
			{
				if (A > B && B > C)
				{
					System.out.print("CAB");
					System.out.print("\n");
				}
				if (B > A && A > C)
				{
					System.out.print("CAB");
					System.out.print("\n");
				}
				if (C > A && A > B)
				{
					System.out.print("BAC");
					System.out.print("\n");
				}
				if (A > C && C > B)
				{
					System.out.print("BCA");
					System.out.print("\n");
				}
				if (B > C && C > A)
				{
					System.out.print("ACB");
					System.out.print("\n");
				}
				if (C > B && B > A)
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
