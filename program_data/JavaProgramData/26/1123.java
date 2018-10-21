package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  hw
	//
	//  Created by ? ? on 12-12-16.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//


	public static void Main(String[] args)
	{
		String str = new String(new char[LEN]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int k;
		for (int i = 0; i < len; i += k)
		{
			k = 1;
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				System.out.print(" ");
				while (str.charAt(i + k) == ' ')
				{
					k++;
				}
			}
		}
	}

}
