package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2011-10-12
	* @description
	* ??????: ???
	*/
	public static int Main()
	{
		int riceA;
		int riceB;
		int riceC;
		int wordA;
		int wordB;
		int wordC;
		for (riceA = 0;riceA <= 2;riceA++)
		{
			for (riceB = 0;riceB <= 2;riceB++)
			{
					if (riceB == riceA)
					{
						continue;
					}
				for (riceC = 0;riceC <= 2;riceC++)
				{
						if (riceC == riceA || riceC == riceB)
						{
							continue;
						}
						wordA = (riceB > riceA) + (riceC == riceA);
						wordB = (riceA > riceB) + (riceA > riceC);
						wordC = (riceC > riceB) + (riceB > riceA);
						if ((wordA + riceA == 2) && (wordB + riceB == 2) && (wordA + riceA == 2))
						{
							if ((riceA < riceB) && (riceA < riceC) && (riceB < riceC))
							{
								System.out.print("ABC");
							}
							if ((riceA < riceB) && (riceA < riceC) && (riceB> riceC))
							{
								System.out.print("ACB");
							}
							if ((riceB < riceA) && (riceB < riceC) && (riceA < riceC))
							{
								System.out.print("BAC");
							}
							if ((riceB < riceA) && (riceB < riceC) && (riceA> riceC))
							{
								System.out.print("BCA");
							}
							if ((riceC < riceA) && (riceC < riceB) && (riceA < riceB))
							{
								System.out.print("CAB");
							}
							if ((riceC < riceA) && (riceC < riceB) && (riceA> riceB))
							{
								System.out.print("CBA");
							}
						}
				}
			}
		}
	return 0;
	}
}
