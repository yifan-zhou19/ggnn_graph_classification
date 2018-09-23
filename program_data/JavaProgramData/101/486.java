package <missing>;

public class GlobalMembers
{
	/**
	 * @file    3.cpp              
	 * @author  ??? 1100013230               
	 * @date    2011-10-13         
	 * @descrption        
	 *          ??????????    
	*/

	public static int Main()
	{
		int A; // A?B?C????A?B?C???
		int B;
		int C;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++) // ?A?B?C???????
			{
				if (B == A) // A?B?C???
				{
					continue;
				}
				else
				{
					C = 3 - B - A;
					if (((B > A) + (C == A) == (2 - A)) && ((A > B) + (A > C) == (2 - B)) && ((C > B) + (B > A) == (2 - C))) // ??????????????????
					{
						if (A < B && A < C)
						{
							System.out.print("A");
							if (B < C)
							{
								System.out.print("B");
								System.out.print("C");
							}
							else
							{
								System.out.print("C");
								System.out.print("B");
							}
						}
						if (B < A && B < C)
						{
							System.out.print("B");
							if (A < C)
							{
								System.out.print("A");
								System.out.print("C");
							}
							else
							{
								System.out.print("C");
								System.out.print("A");
							}
						}
						if (C < B && C < A)
						{
							System.out.print("C");
							if (B < A)
							{
								System.out.print("B");
								System.out.print("A");
							}
							else
							{
								System.out.print("A");
								System.out.print("B");
							}
						}
					}
				}
			}
		}
		return 0;
	}


}
