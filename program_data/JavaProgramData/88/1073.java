package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  hw
	//
	//  Created by ? ? on 12-12-19.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//

	public static int number(char x)
	{
		if (x >= '0' && x <= '9')
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main(String[] args)
	{
		String str = new String(new char[LEN + 3]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		str = tangible.StringFunctions.changeCharacter(str, len + 1, '^');
		for (int i = 0; i < len; i++)
		{
			if (number(str.charAt(i)) != 0)
			{
				str = str.substring(0, i);
			}
		}
		String begin;
		String end;
		int k = 0;
		while (str.charAt(k) == 0)
		{
			k++;
		}
		begin = str.charAt(k);
		end = str.charAt(k + begin.length());
		while (true)
		{
			System.out.print(begin);
			System.out.print("\n");

			int i = 1;
			while (*(end.Substring(i)) == 0 && *(end.Substring(i)) != '^')
			{
				i++;
			}
			if (*(end.Substring(i)) == '^')
			{
				break;
			}
			begin = end.Substring(i);
			end += i + begin.length();
		}
	}

}

