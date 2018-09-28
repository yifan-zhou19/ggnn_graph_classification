package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ??3 5 7????
	//
	//  Created by Neptune on 12-10-2.
	//  Copyright (c) 2012? ??? 1200012777. All rights reserved.
	//

	public static int Main()
	{
		int A;
		A = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (A % 3 == 0 && A % 5 == 0 && A % 7 == 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
			else if (A % 3 == 0 && A % 5 == 0 && A % 7 != 0)
			{
				System.out.print("3 5");
				System.out.print("\n");
			}
				else if (A % 3 == 0 && A % 5 != 0 && A % 7 == 0)
				{
					System.out.print("3 7");
					System.out.print("\n");
				}
					else if (A % 3 != 0 & A % 5 == 0 && A % 7 == 0)
					{
						System.out.print("5 7");
						System.out.print("\n");
					}
						else if (A % 3 == 0)
						{
							System.out.print("3");
							System.out.print("\n");
						}
							else if (A % 5 == 0)
							{
								System.out.print("5");
								System.out.print("\n");
							}
								else if (A % 7 == 0)
								{
									System.out.print("7");
									System.out.print("\n");
								}
								else
								{
									System.out.print("n");
									System.out.print("\n");
								}
		return 0;
	}



}

