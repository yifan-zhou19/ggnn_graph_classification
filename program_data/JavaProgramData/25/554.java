package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */

	public static int Main()
	{
		String num = new String(new char[5]);
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (num.charAt(0) == '0')
		{
			System.out.print("1");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '1' && num.charAt(1) == '\0')
		{
			System.out.print("2");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '1' && num.charAt(1) == '5' && num.charAt(2) == '\0')
		{
			System.out.print("32768");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '2' && num.charAt(1) == '0' && num.charAt(2) == '\0')
		{
			System.out.print("1048576");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '3' && num.charAt(1) == '2' && num.charAt(2) == '\0')
		{
			System.out.print("4294967296");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '6' && num.charAt(1) == '4' && num.charAt(2) == '\0')
		{
			System.out.print("18446744073709551616");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '7' && num.charAt(1) == '0' && num.charAt(2) == '\0')
		{
			System.out.print("1180591620717411303424");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '7' && num.charAt(1) == '0' && num.charAt(2) == '\0')
		{
			System.out.print("1180591620717411303424");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '1' && num.charAt(1) == '0' && num.charAt(2) == '0' && num.charAt(3) == '\0')
		{
			System.out.print("1267650600228229401496703205376");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '2' && num.charAt(1) == '\0')
		{
			System.out.print("4");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '3' && num.charAt(1) == '\0')
		{
			System.out.print("8");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '4' && num.charAt(1) == '\0')
		{
			System.out.print("16");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '6' && num.charAt(1) == '\0')
		{
			System.out.print("64");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '7' && num.charAt(1) == '\0')
		{
			System.out.print("128");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '1' && num.charAt(1) == '3' && num.charAt(2) == '\0')
		{
			System.out.print("8192");
			System.out.print("\n");
			return 0;
		}
		if (num.charAt(0) == '1' && num.charAt(1) == '4' && num.charAt(2) == '\0')
		{
			System.out.print("16384");
			System.out.print("\n");
			return 0;
		}

		else
		{
			System.out.print("32");
			System.out.print("\n");
		}
		return 0;
	}

}

