package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		int a2;
		int b2;
		int c2;
		int a1;
		int b1;
		int c1;
		for (A = 0;A < 3;A++)
		{
			for (B = 0;B < 3;B++)
			{
				for (C = 0;C < 3;C++) //??????ABC?????
				{
					a1 = B > A;
					a2 = C == A;
					b1 = A > B;
					b2 = A > C;
					c1 = C > B;
					c2 = B > A; //??????
					if (A > B && a1 + a2 < b1 + b2)
					{
						if (B > C && b1 + b2 < c1 + c2)
						{
							System.out.print("CBA");
						}
						else if (B < C && b1 + b2> c1 + c2)
						{
							if (A > C && a1 + a2 < c1 + c2)
							{
								System.out.print("BCA");
							}
							else if (A < C && a1 + a2> c1 + c2)
							{
								System.out.print("BAC");
							}
						}
					}
					else if (A < B && a1 + a2> b1 + b2)
					{
						if (A > C && a1 + a2 < c1 + c2)
						{
							System.out.print("CAB");
						}
						else if (A < C && a1 + a2> c1 + c2)
						{
							if (C > B && c1 + c2 < b1 + b2)
							{
								System.out.print("ABC");
							}
							else if (C < B && c1 + c2> b1 + b2)
							{
								System.out.print("ACB");
							}
						}
					}
				}

			}
		}
		return 0;
	}
}
