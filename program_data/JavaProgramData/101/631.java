package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //???????
		int B;
		int C;
		int As; //????????
		int Bs;
		int Cs;
		int AnsA; //????
		int AnsB;
		int AnsC;
		for (A = 1; A < 4; A++) //??A???
		{
			for (B = 1; B < 4; B++) //??B???
			{
				for (C = 1; C < 4; C++) //??C???
				{
					As = (B > A) + (C == A); //A???
					Bs = (A > B) + (A > C); //B???
					Cs = (C > B) + (B > A); //C???
					//????????????????  
					if (!((A <= B) && (As <= Bs) || (A <= C) && (As <= Cs) || (B <= A) && (Bs <= As) || (B <= C) && (Bs <= Cs) || (C <= A) && (Cs <= As) || (C <= B) && (Cs <= Bs)))
					{
						AnsA = A;
						AnsB = B;
						AnsC = C;
					}
				}
			}
		}
		if (AnsA >= AnsB != 0 && AnsB >= AnsC)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		if (AnsA >= AnsC != 0 && AnsC >= AnsB)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (AnsB >= AnsA != 0 && AnsA >= AnsC)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (AnsB >= AnsC != 0 && AnsC >= AnsA)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		if (AnsC >= AnsA != 0 && AnsA >= AnsB)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (AnsC >= AnsB != 0 && AnsB >= AnsA)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		return 0; //?????
	}
}
