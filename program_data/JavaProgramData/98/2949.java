package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 1.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int length = 0;

	public static void itype(String[] a, int i) //?????
	{
		int b = a[i].length(); //????
		if (length == 0) //????????
		{
			System.out.print(a[i]);
		}
		else if (length + b + 1 <= 80) //?????
		{
			System.out.print(" ");
			System.out.print(a[i]);
			length++;
		}
		else //????
		{
			System.out.print("\n");
			System.out.print(a[i]);
			length = 0;
		}
		length += b;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] character = new char[1000][50];
		for (int i = 0;i < n;i++) //?????
		{
			character[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			itype(character, i);
		}
		return 0;
	}
}

