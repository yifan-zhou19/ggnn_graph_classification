package <missing>;

public class GlobalMembers
{
	/**
	* @file 3.cpp
	* @author ???
	* @date 2011-10-15
	* @description
	* ??????: ??? 
	*/
	public static int Main()
	{
	int eA;
	int eB;
	int eC;
	int sA;
	int sB;
	int sC;
	 // ????????????eA eB eC = 1, 2, 3?????
	for (eA = 1; eA <= 3; eA++)
	{
		for (eB = 1; eB <= 3; eB++)
		{
			for (eC = 1; eC <= 3; eC++)
			{
			sA = (eB > eA) + (eC == eA);
			sB = (eA > eB) + (eA > eC);
			sC = (eC > eB) + (eB > eA);
			// ????????????????
					  if (sA + eA == 3 && sB + eB == 3 && sC + eC == 3 && eA != eB && eB != eC && eC != eA)
					  { // ????
	if (eA < eB && eB < eC)
	{
		System.out.print("ABC");
		System.out.print("\n");
	}
	if (eA < eC && eC < eB)
	{
		System.out.print("ACB");
		System.out.print("\n");
	}
	if (eB < eA && eA < eC)
	{
		System.out.print("BAC");
		System.out.print("\n");
	}
	if (eB < eC && eC < eA)
	{
		System.out.print("BCA");
		System.out.print("\n");
	}
	if (eC < eA && eA < eB)
	{
		System.out.print("CAB");
		System.out.print("\n");
	}
	if (eC < eB && eB < eA)
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
