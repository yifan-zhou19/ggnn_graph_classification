import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 7.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: 10033
	 */


	public static int n;
	public static int n0;
	public static int i;
	public static int j;
	public static char nan;
	public static char nv;
	public static String a = new String(new char[1000]); //????

	public static void paidui(int j)
	{ //???????j=0????????????
		int k;
		for (k = j;k < n0;k++)
		{
			if (a.charAt(k) == nan)
			{
				break;
			}
		}
		j = k;
		for (i = j + 1;i < n0;i++) //??????
		{
			if (a.charAt(i) != '.')
			{
				break;
			}
		}
		while (a.charAt(i) == nan)
		{ //????????????
			paidui(j + 1);
			for (i = j + 1;i < n0;i++)
			{
				if (a.charAt(i) != '.')
				{
					break;
				}
			}
		}
		if (a.charAt(i) == nv)
		{ //??j????,??,?".",????
			System.out.print(j);
			System.out.print(" ");
			System.out.print(i);
			System.out.print("\n");
			a = tangible.StringFunctions.changeCharacter(a, j, '.');
			a = tangible.StringFunctions.changeCharacter(a, i, '.');
			return;
		}
	}
	public static int Main()
	{ //????
		a = new Scanner(System.in).nextLine(); //??
		nan = a.charAt(0); //????
		n0 = a.length(); //???
		nv = a.charAt(n0 - 1); //????
		paidui(0); //????
		return 0;
	} //????

}

