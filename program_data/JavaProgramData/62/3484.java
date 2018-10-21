import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * Filterredundantspace.cpp
	 *
	 *  Created on: 2012-11-21
	 *      Author: ???
	 */
	public static int i;
	public static int b;
	public static int Main()
	{
		String a = new String(new char[50]); //???????
		a = new Scanner(System.in).nextLine(); //??????????
		b = a.length(); //????????
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.print(a.charAt(i));
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				System.out.print(' ');
			}


		}




	}

}
