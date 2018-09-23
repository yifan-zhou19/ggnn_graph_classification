package <missing>;

public class GlobalMembers
{
	/*
	 *100008.cpp
	 *??????
	 *Created on: 2012-10-5
	 *Author:??
	 */
	public static int A = 0; //????
	public static int B = 0;
	public static int C = 0;
	public static int Main()
	{
		for (A = 0;A < 3;A++)
		{ //?????
			for (B = 0;B < 3;B++)
			{
				if (A != B)
				{
				for (C = 0;C < 3;C++)
				{
					if (C != A && C != B)
					{
						if (((B > A) + (C == A)) == 2 & ((A > B) + (A > C)) == 1 & ((C > B) + (B > A)) == 0 & (C > B > A) == 1) //????????
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
						if (((B > A) + (C == A)) == 2 & ((A > B) + (A > C)) == 0 & ((C > B) + (B > A)) == 1 & (B > C > A) == 1)
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
						if (((B > A) + (C == A)) == 1 & ((A > B) + (A > C)) == 0 & ((C > B) + (B > A)) == 2 & (B > A > C) == 1)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						if (((B > A) + (C == A)) == 1 & ((A > B) + (A > C)) == 2 & ((C > B) + (B > A)) == 0 & (C > A > B) == 1)
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
						if (((B > A) + (C == A)) == 0 & ((A > B) + (A > C)) == 1 & ((C > B) + (B > A)) == 2 & (A > B > C) == 1)
						{
							System.out.print("CBA");
							System.out.print("\n");
						}
						if (((B > A) + (C == A)) == 0 & ((A > B) + (A > C)) == 2 & ((C > B) + (B > A)) == 1 & (A > C > B) == 1)
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
					}
				}
				}
			}
		}
	return 0;
	}

}
