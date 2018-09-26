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
		double rate;
		String gen1 = new String(new char[500]);
		String gen2 = new String(new char[500]);
		rate = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		gen1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		gen2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = gen1.length();
		int len2 = gen2.length();
		int S = 0;
		if (len1 != len2)
		{
			System.out.print("error");
			System.out.print("\n");
		}
		for (int i = 0; i < len1; i++)
		{
			if ((gen2.charAt(i) != 'A' && gen2.charAt(i) != 'T' && gen2.charAt(i) != 'C' && gen2.charAt(i) != 'G') || (gen1.charAt(i) != 'A' && gen1.charAt(i) != 'T' && gen1.charAt(i) != 'C' && gen1.charAt(i) != 'G'))
			{
				System.out.print("error");
				System.out.print("\n");
			}
			if (gen1.charAt(i) == gen2.charAt(i))
			{
				S++;
			}
		}
		double R;
		R = (double)S / len1;
		if (R >= rate)
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		else
		{
			System.out.print("no");
			System.out.print("\n");
		}
	}

}

