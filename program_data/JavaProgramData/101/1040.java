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
		for (A = 1; A <= 3; A++)
		{
			for (B = 1; B <= 3; B++)
			{
				for (C = 1; C <= 3; C++)
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if (A == 3 - a && B == 3 - b && C == 3 - c && A != B && B != C && A != C)
					{

		for (int i = 1; i <= 3; i++)
		{
			if (i == A)
			{
				System.out.print("A");
			}
			if (i == B)
			{
				System.out.print("B");
			}
			if (i == C)
			{
				System.out.print("C");
			}
		}
					}
				}
			}
		}

		return 0;
	}

}
