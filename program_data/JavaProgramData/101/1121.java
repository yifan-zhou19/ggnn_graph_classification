package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0; //????A,B,C???
		int B = 0;
		int C = 0;
		int As = 0; //??????????????
		int Bs = 0;
		int Cs = 0;
		int dA = 0; //????????
		int dB = 0;
		int dC = 0;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					As = (B > A) + (C == A);
					Bs = (A > B) + (A > C);
					Cs = (C > B) + (B > A);
					if (!(A <= B != 0 && As <= Bs != 0 || A <= C != 0 && As <= Cs != 0 || B <= A != 0 && Bs <= As != 0 || B <= C != 0 && Bs <= Cs != 0 || C <= A != 0 && Cs <= As != 0 || C <= B != 0 && Cs <= Bs)) //???????????????????????????
					{
						dA = A;
						dB = B;
						dC = C;
					} //??????????
				}
			}
		}
		if (dA >= dB != 0 && dB >= dC)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		if (dA >= dC != 0 && dC >= dB)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (dB >= dA != 0 && dA >= dC)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (dB >= dC != 0 && dC >= dA)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		if (dC >= dA != 0 && dA >= dB)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (dC >= dB != 0 && dB >= dA)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		return 0;
	}

}
