package <missing>;

public class GlobalMembers
{
	// A+B ??.cpp : Defines the entry point for the console application.
	//

	///#include "stdafx.h"

	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		final String j = "";
		final String A = "";
		final String B = "";
		int ac;
		int bc;
		int i;
		int k;
		int c;
		int j1;
		int j2;
		int jw = 0;
		int p = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ac = a.length();
		bc = b.length();
		if (ac > bc)
		{
			c = ac;
			for (i = 0;i < ac - bc;i++)
			{
				B = tangible.StringFunctions.changeCharacter(B, i, '0');
			}
			B = tangible.StringFunctions.changeCharacter(B, i, '\0');
			B += b;
			A = a;
		}
		if (ac < bc)
		{
			c = bc;
			for (i = 0;i < bc - ac;i++)
			{
				A = tangible.StringFunctions.changeCharacter(A, i, '0');
			}
			A = tangible.StringFunctions.changeCharacter(A, i, '\0');
			A += a;
			B = b;
		}
		if (ac == bc)
		{
			c = ac;
			A = a;
			B = b;
		}
		for (i = c - 1,k = 0;i >= 0;i--,k++)
		{
			j1 = A.charAt(i) - '0';
			j2 = B.charAt(i) - '0';
			if (j1 + j2 + jw <= 9)
			{
				j = tangible.StringFunctions.changeCharacter(j, k, j1 + j2 + jw + '0');
				jw = 0;
			}
			else
			{
				j = tangible.StringFunctions.changeCharacter(j, k, j1 + j2 + jw - 10 + '0');
				jw = 1;
			}
			if (i == 0 && jw == 1)
			{
				j = tangible.StringFunctions.changeCharacter(j, k + 1, '1');
			}
		}
		if (j.charAt(0) == '0' && j.charAt(1) == '\0')
		{
			System.out.print("0");
		}
		c = j.length();
		for (i = c - 1;i >= 0;i--)
		{
			if (j.charAt(i) != '0' || p == 1)
			{
				System.out.printf("%c", j.charAt(i));
				p = 1;
			}

		}

		return 0;
	}


}

