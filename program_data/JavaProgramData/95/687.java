import java.util.*;

package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : test3.cpp
	// Author      : Liang ShiYu
	// Version     : 1.0
	// Copyright   : copyright reserved
	// Description : about string
	//============================================================================


	public static int Main()
	{ //main function
		String a = new String(new char[80]);
		String b = new String(new char[80]); //dim string a and string b for storing the input
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine(); //get the input
		int n = a.length(); //calculate the length of the string
		for (int i = 0;i < n;i++)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				a.charAt(i) -= 32;
			}
		}
		n = b.length();
		for (int i = 0;i < n;i++)
		{
			if (b.charAt(i) >= 97 && b.charAt(i) <= 122)
			{
				b.charAt(i) -= 32;
			}
		} //edit each string
		int z;
		z = strcmp(a,b); //compare the two string
		if (z < 0)
		{
			System.out.print("<");
		}
		if (z == 0)
		{
			System.out.print("=");
		}
		if (z > 0)
		{
			System.out.print(">");
		}
		return 0;
	}

}
