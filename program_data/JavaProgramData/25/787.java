package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ??2?N??
	//
	//  Created by ? ?? on 12-12-10.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//

	public static int n;
	public static int sum = 5;
	public static String a = new String(new char[999999999]);
	public static String b = new String(new char[999999999]);
	public static int p = 0;
	public static int l = 2;

	public static void cheng(int m)
	{
		p = 0;
		int i;
		for (i = l; i >= 1; i--)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, ((a.charAt(i - 1) - '0') * 2 % 10 + p) % 10 + '0');
			p = ((a.charAt(i - 1) - '0') * 2 + p) / 10;
		}
		b = tangible.StringFunctions.changeCharacter(b, 0, p + '0');
		if (b.charAt(0) != '0')
		{
			l++;
		}
		if (b.charAt(0) == '0')
		{
			for (i = 0; i < l; i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
			}
		}
		a = b;
		if (sum < n)
		{
			cheng(sum++);
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
		}
		if (n == 1)
		{
			System.out.print(2);
		}
		if (n == 2)
		{
			System.out.print(4);
		}
		if (n == 3)
		{
			System.out.print(8);
		}
		if (n == 4)
		{
			System.out.print(16);
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, '1');
		a = tangible.StringFunctions.changeCharacter(a, 1, '6');
		if (n > 4)
		{
			cheng(sum);
			for (int i = 0; i < l; i++)
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}

}

