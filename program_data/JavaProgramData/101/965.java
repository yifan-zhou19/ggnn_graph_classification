package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  poj
	//
	//  Created by ChuPan,Wong on 9/27/13.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//


	public static void Main(String[] args)
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (int i = 1;i < 4;i++)
		{
			for (int j = 1;j < 4;j++)
			{
				for (int k = 1;k < 4;k++)
				{
					A = i;
					B = j;
					C = k;
					a = (int)(B > A) + (int)(A == C);
					b = (int)(A > B) + (int)(A > C);
					c = (int)(C > B) + (int)(B > A);
					if (!((A >= B != 0 && a > b) || (A >= C != 0 && a > c) || (B >= A != 0 && b > a) || (B >= C != 0 && b > c) || (C >= A != 0 && c > a) || (C >= B != 0 && c > b)))
					{
						if (A >= B != 0 && B >= C)
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
						else if (A >= C != 0 && C >= B)
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
						else if (B >= A != 0 && A >= C)
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
						else if (B >= C != 0 && C >= A)
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
						else if (C >= A != 0 && A >= B)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						else
						{
							System.out.print("CBA");
							System.out.print("\n");
						}
					}

				}
			}
		}

	}

}
