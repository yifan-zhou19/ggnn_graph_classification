package <missing>;

public class GlobalMembers
{
	//*********************************************************************
	//*????food.cpp                                                   *
	//*?  ??spica                                                      *
	//*?????2011?11?                                               *
	//*????:????????3?????                               *
	//*********************************************************************
	public static int Main()
	{
		int A = 0; //????????A,B,C
		int B = 0;
		int C = 0;
		int Aw = 0; //???????Aw,Bw,Cw
		int Bw = 0;
		int Cw = 0;
		int As = 0; // ??????As,Bs,Cs
		int Bs = 0;
		int Cs = 0;
		for (A = 1;A <= 3;A++) //??A?1�3???????
		{
			for (B = 1;B <= 3;B++) //??B?1�3???????
			{
				for (C = 1;C <= 3;C++) //??C?1�3???????
				{
					Aw = (B > A) + (C == A); //A????
					Bw = (A > B) + (A > C); //B????
					Cw = (C > B) + (B > A); //C????
					if (!(A <= B != 0 && Aw <= Bw != 0 || A <= C != 0 && Aw <= Cw != 0 || B <= A != 0 && Bw <= Aw != 0 || B <= C != 0 && Bw <= Cw != 0 || C <= A != 0 && Cw <= Aw)) //??????????????????????????????????
					{
						As = A;
						Bs = B;
						Cs = C;
					}
				}
			}
		}
		if (As >= Bs != 0 && Bs >= Cs) //A>=B>=C
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		if (As >= Cs != 0 && Cs >= Bs) //A>=C>=B
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (Bs >= As != 0 && As >= Cs) //B>=A>=C
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (Bs >= Cs != 0 && Cs >= As) //B>=C>=A
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (Cs >= As != 0 && As >= Bs) //C>=A>=B
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (Cs >= Bs != 0 && Bs >= As) //C>=B>=A
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		return 0;
	}

}
