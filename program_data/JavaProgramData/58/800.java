import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 111202_6_AcceptableIdentifier.cpp
	 *
	 *  Created on: 2011-12-4
	 *      Author: Alfalfa
	 */
	public static void judge(String word)
	{ //??????
		int len = word.length();
		int flag = 0;
		if (word[0].compareTo('A') < 0 || (word[0].compareTo('Z') > 0 && word[0].compareTo('_') < 0) || (word[0].compareTo('_') > 0 && word[0].compareTo('a') < 0) || word[0].compareTo('z') > 0)
		{
			System.out.print(0);
			System.out.print("\n");
			flag = 1;
		} //????????? ???0
		else
		{
			for (int i = 1;i < len;i++)
			{
			if (word[i].compareTo('0') < 0 || (word[i].compareTo('9') > 0 && word[i].compareTo('A') < 0) || (word[i].compareTo('Z') > 0 && word[i].compareTo('_') < 0) || (word[i].compareTo('_') > 0 && word[i].compareTo('a') < 0) || word[i].compareTo('z') > 0)
			{
				System.out.print(0);
				System.out.print("\n");
				flag = 1;
				break; //??????
			}
			}
		}
		if (flag == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int n;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		b = new Scanner(System.in).nextLine();
		for (j = 0;j < n;j++)
		{
			a = new Scanner(System.in).nextLine();
			judge(a);
		}
		return 0;
	}

}

