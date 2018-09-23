import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  match
	//
	//  Created by blues cookie on 12-11-28.
	//  Copyright (c) 2012? blues cookie. All rights reserved.
	//

	public static int length;
	public static String a = new String(new char[1000]);
	public static String c = new String(new char[100]);
	public static int[] b = new int[100]; //???????????
	public static int zkh = 0; //????????
	public static int match(int i)
	{
		if (i == length)
		{
			return 0;
		}
		if (a.charAt(i) == '(')
		{
			zkh = zkh + 1;
			c = tangible.StringFunctions.changeCharacter(c, i, '$');
			b[zkh] = i;
		}
		if (a.charAt(i) == ')')
		{
			if (zkh == 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '?');
			}
			if (zkh != 0) //????????
			{
				c = tangible.StringFunctions.changeCharacter(c, b[zkh], ' ');
				zkh = zkh - 1;
				c = tangible.StringFunctions.changeCharacter(c, i, ' ');
			}
		}
		if (a.charAt(i) != '(' && a.charAt(i) != ')')
		{
			c = tangible.StringFunctions.changeCharacter(c, i, ' ');
		}
		match(i + 1);
	}

	public static void Main(String[] args)
	{
		int j;
		int k;
		int l;
		while (a = new Scanner(System.in).nextLine())
		{
			zkh = 0;
			length = a.length();
			for (j = 0;j < length;j++)
			{
				System.out.print(a.charAt(j));
			}
			System.out.print("\n");

			match(0); //??????

			for (l = 0;l < length;l++)
			{
				System.out.print(c.charAt(l));
			}
			System.out.print("\n");


		}
	}

}

