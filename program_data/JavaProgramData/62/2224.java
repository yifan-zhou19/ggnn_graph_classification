import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * shuzu2.12.cpp
	 *
	 *  Created on: 2013-11-12
	 *      Author: st
	 */
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int k;
		int spcamount = 0;

		for (i = 0;i < a.length();i++)
		{
		   if ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' '))
		   {
			   continue;
		   }
		   else
		   {
			   if ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' '))
			   {
					   spcamount++;
				   for (k = i;k < a.length() - spcamount;k++)
				   {
					a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1));
				   }
					i--;
			   }
		   }
		}

	   for (i = 0;i < a.length() - spcamount;i++)
	   {
			System.out.print(a.charAt(i));
	   }
		return 0;



	}

}

