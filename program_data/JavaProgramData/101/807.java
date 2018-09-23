package <missing>;

public class GlobalMembers
{
	//**********************************
	//****       ??????     *****
	//****        1200016612       *****
	//**      ??????    **********
	//**********************************
	public static int Main() //?????
	{
		int A;
		int B;
		int C;
		int[] c = new int[3];
		int t;
		for (A = 0;A <= 2;A++)
		{ //?A,B,C??????0,1,2??
			for (B = 0;B <= 2;B++)
			{
				for (C = 0;C <= 2;C++)
				{
					c[0] = (B > A) + (C == A); //????????????
					c[1] = (A > B) + (A > C);
					c[2] = (C > B) + (B > A);
					if (c[0] + A == 2 && c[1] + B == 2 && c[2] + C == 2)
					{ //?????????0,1,2???????????????????2
						if (A <= B != 0 && B <= C) //?????
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
						if (A <= C != 0 && C <= B)
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
						if (B <= A != 0 && A <= C)
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
						if (B <= C != 0 && C <= A)
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
						if (C <= A != 0 && A <= B)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						if (C <= B != 0 && B <= A)
						{
							System.out.print("CBA");
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
