package <missing>;

public class GlobalMembers
{
	/*
	 * 70.cpp
	 * ???
	 *  Created on: 2012-9-16
	 *      Author: Salforever
	 */



	public static int Main()
	{
		int A;
		int B;
		int C;
		int As;
		int Bs;
		int Cs;
		int AnsA; //????
		int AnsB;
		int AnsC;
		for (A = 1; A <= 3; A++)
		{
			for (B = 1; B <= 3; B++)
			{
				for (C = 1; C <= 3; C++) //????
				{
					As = (B > A) + (C == A);
					Bs = (A > B) + (A > C);
					Cs = (C > B) + (B > A); //??????
					if ((A + As == 3) && (B + Bs == 3) && (C + Cs == 3)) //????????
					{
						AnsA = A;
						AnsB = B;
						AnsC = C;
					}
				}
			}
		}
		if (AnsA <= AnsB != 0 && AnsB <= AnsC)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		if (AnsA <= AnsC != 0 && AnsC <= AnsB)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		if (AnsB <= AnsA != 0 && AnsA <= AnsC)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (AnsB <= AnsC != 0 && AnsC <= AnsA)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (AnsC <= AnsA != 0 && AnsA <= AnsB)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (AnsC <= AnsB != 0 && AnsB <= AnsA)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		return 0; //????
	}

}
