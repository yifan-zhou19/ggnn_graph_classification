package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int c1;
		int c2;
		int c3;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				for (C = 0; C <= 2; C++)
				{
					if (A != B && A != C && B != C)
					{
						c1 = (B > A) + (C == A);
						c2 = (A > B) + (A > C);
						c3 = (C > B) + (B > A);
						if (A + c1 == 2 && B + c2 == 2 && C + c3 == 2)
						{
							if (A > B && B > C)
							{
								System.out.print("C");
								System.out.print("B");
								System.out.print("A");
							}
							if (A > C && C > B)
							{
								System.out.print("B");
								System.out.print("C");
								System.out.print("A");
							}
							if (B > A && A > C)
							{
								System.out.print("C");
								System.out.print("A");
								System.out.print("B");
							}
							if (B > C && C > A)
							{
								System.out.print("A");
								System.out.print("C");
								System.out.print("B");
							}
							if (C > A && A > B)
							{
								System.out.print("B");
								System.out.print("A");
								System.out.print("C");
							}
							if (C > B && B > A)
							{
								System.out.print("A");
								System.out.print("B");
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
