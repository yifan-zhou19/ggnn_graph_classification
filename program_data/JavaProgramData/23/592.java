import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-9
	 *      Author: 99003
	 */

	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[10000]);
		char[][] word = new char[1000][100];
		int[] wordl = new int[1000];
		a = new Scanner(System.in).nextLine();
		int length;
		int wordn;
		wordn = 1;
		length = a.length();
		wordl[1] = 0;
		for (i = 0;i < length;i++) //?????????
		{
			if (a.charAt(i) != ' ')
			{
				word[wordn][wordl[wordn] + 1] = a.charAt(i);
				wordl[wordn] = wordl[wordn] + 1;
			}
			if (a.charAt(i) == ' ')
			{
				wordn = wordn + 1;
			}
		}
		for (i = wordn;i >= 1;i--) //????
		{
			for (j = 1;j <= wordl[i];j++)
			{
				System.out.print(word[i][j]);
			}
			  if (i != 1)
			  {
				  System.out.print(" ");
			  }
		}




		return 0;


	}
}
