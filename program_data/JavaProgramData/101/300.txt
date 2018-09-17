package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++) //???????1????3??a,b,c????
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A); //??3??????
					a + b + c == 3;
					if (A + a == 3 && B + b == 3 && C + c == 3) //???????? ???????????????
					{
						if (A > B)
						{
							if (B > C)
							{
								System.out.print("CBA");
								System.out.print("\n");
							}
							else
							{
								System.out.print("BCA");
								System.out.print("\n");
							}
						}
						else if (B > A)
						{
							if (A > C)
							{
								System.out.print("CAB");
								System.out.print("\n");
							}
							else
							{
								System.out.print("ACB");
								System.out.print("\n");
							}
						}
						else if (C > A)
						{
							if (A > B)
							{
								System.out.print("BAC");
								System.out.print("\n");
							}
							else
							{
								System.out.print("ABC");
								System.out.print("\n");
							}
						} //????? ?? ????
					}
				}
			}
		}
				return 0;
	}
}
