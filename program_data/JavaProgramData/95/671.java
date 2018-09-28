import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *  Main.cpp
	 *
	 *  Created on: 2010-11-5
	 *      Author: 10010
	 */

	public static int Main()
	{
		void change(char str[]); //??????
		String str_1 = new String(new char[80]);
		String str_2 = new String(new char[80]);

		str_1 = new Scanner(System.in).nextLine(); //????
		str_2 = new Scanner(System.in).nextLine();

		change(str_1); //????
		change(str_2);

		switch (strcmp(str_1,str_2)) //switch????
		{
		case 0:
			System.out.print('=');
			break;
		case -1:
			System.out.print('<');
			break;
		case 1:
			System.out.print('>');
			break;
		}

		return 0;
	}



	public static void change(String str)
	{
		int i;
		int t;
		t = str.length();
		for (i = 0;i < t;i++) //???? ?????????????
		{
			if (str[i].compareTo('A') >= 0 && str[i].compareTo('Z') <= 0)
			{
				str[i] -= 'A'-'a';
			}
		}
	}

}
