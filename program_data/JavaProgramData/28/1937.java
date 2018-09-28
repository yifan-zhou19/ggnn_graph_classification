package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ds
	//
	//  Created by Love on 12-12-27.
	//  Copyright (c) 2012? Love. All rights reserved.
	//

	public static int Main()
	{
		String s = new String(new char[10000]);
		int i;
		int num = 0;
		int final;
		s = new Scanner(System.in).nextLine();
		for (i = 0; s.charAt(i); i++)
		{
			if (s.charAt(i) != ' ')
			{
				num++;

			}
			else
			{
				if (num == 0)
				{
				}
				else
				{
				System.out.printf("%d,",num);
				num = 0;
				}


			}
		}
		System.out.printf("%d",num);
		return 0;
	}

}
