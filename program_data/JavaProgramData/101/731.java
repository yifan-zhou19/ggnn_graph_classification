package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2012-10-14
	 *      Author: ??
	 */

	public static int Main()
	{
		int A; //A,B,C????????????cc1,cc2,cc3????????
		int B;
		int C;
		int cc1;
		int cc2;
		int cc3;
		for (A = 0;A <= 2;A++)
		{
			for (B = 0;B <= 2;B++)
			{
				if (B == A)
				{
					continue;
				}
				for (C = 0;C <= 2;C++)
				{
					if ((C == A) || (C == B))
					{
						continue;
					}

					cc1 = (B > A) + (C == A);
					cc2 = (A > B) + (A > C);
					cc3 = (C > B) + (B > A);

					if ((A + cc1 == 2) && (B + cc2 == 2) && (C + cc3 == 2))
					{
					   if (A == 2 && B == 1 && C == 0)
					   {
						   System.out.print("CBA");
						   System.out.print("\n");
					   }
					   if (A == 2 && B == 0 && C == 1)
					   {
						   System.out.print("BCA");
						   System.out.print("\n");
					   }
					   if (A == 1 && B == 2 && C == 0)
					   {
						   System.out.print("CAB");
						   System.out.print("\n");
					   }
					   if (A == 1 && B == 0 && C == 2)
					   {
						   System.out.print("BAC");
						   System.out.print("\n");
					   }
					   if (A == 0 && B == 1 && C == 2)
					   {
						   System.out.print("ABC");
						   System.out.print("\n");
					   }
					   if (A == 0 && B == 2 && C == 1)
					   {
						   System.out.print("ACB");
						   System.out.print("\n");
					   }

					}
				}
			}
		}
		return 0;
	}
}
