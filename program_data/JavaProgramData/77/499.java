package <missing>;

public class GlobalMembers
{
	/*
	 * qimomoni_2.cpp
	 *	????
	 *  Created on: 2011-1-8
	 *      Author: ???
	 */

	public static int Try(int i,char boy)
	{
		char a;
		int b;
		cin.get(a);
		if (a != boy)
		{
			return i;
		}
		else
		{
			b = Try(i + 1, boy);
			System.out.print(i);
			System.out.print(' ');
			System.out.print(b);
			System.out.print("\n");
			return Try(b + 1, boy);
		}
	}
	public static int Main()
	{
		int i = 0;
		int b;
		char boy;
		boy = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Try(i + 1, boy);
		System.out.print(i);
		System.out.print(' ');
		System.out.print(b);
		return 0;
	}

}

